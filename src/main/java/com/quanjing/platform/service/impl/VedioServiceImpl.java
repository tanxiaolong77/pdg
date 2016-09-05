/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.vo.ChannelCategoryVo;
import com.quanjing.model.platform.vo.SubjectCategoryVo;
import com.quanjing.model.platform.vo.VedioMainVo;
import com.quanjing.model.platform.vo.VedioVo;
import com.quanjing.platform.dao.VedioDao;
import com.quanjing.platform.query.ChannelCategoryQuery;
import com.quanjing.platform.query.SubjectCategoryQuery;
import com.quanjing.platform.query.VedioQuery;
import com.quanjing.platform.service.ChannelCategoryService;
import com.quanjing.platform.service.ImageService;
import com.quanjing.platform.service.SubjectCategoryService;
import com.quanjing.platform.service.UserService;
import com.quanjing.platform.service.VedioService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("vedioService")
public class VedioServiceImpl extends BaseService<Vedio,java.lang.Long> implements VedioService {
	
	@Autowired
	private VedioDao vedioDao;
	
	@Autowired	
	@Qualifier("userService")
	private UserService userService;
	@Autowired	
	@Qualifier("subjectCategoryService")
	private SubjectCategoryService subjectCategoryService;
	@Autowired	
	@Qualifier("channelCategoryService")
	private ChannelCategoryService channelCategoryService;
	@Autowired	
	@Qualifier("imageService")
	private ImageService imageService;
	
	public EntityDao getEntityDao() {
		return this.vedioDao;
	}
	
	/**
	 * 封装
	 * @param vo
	 */
	private void incasement(VedioVo vo){
		vo.setUser(userService.getById(vo.getCreateUser()));
		if(null != vo.getImageId())
			vo.setImage(imageService.getById(vo.getImageId()));
		
		if(null != vo.getFootage())
			vo.setFootageStr(formatLongToTimeStr(vo.getFootage().longValue()));
	}
	
	public VedioVo getById(Long id){
		VedioVo vo = (VedioVo)vedioDao.getById(id);
		if(null != vo)
			incasement(vo);
		return vo;
	}
	
	
	public PageInfo findPage(VedioQuery query){
		PageHelper.startPage(query);
		List<VedioVo> vos = vedioDao.findPage(query);
		for (VedioVo vo : vos) {
			incasement(vo);
		}
		return new PageInfo(vos);
	}
	
	public List  findVedios(VedioQuery query){
		List<VedioVo> vos = vedioDao.findPage(query);
		for (VedioVo vo : vos) {
			incasement(vo);
		}
		return vos;
	}
	

	public VedioMainVo mainVedios(VedioQuery query){
		VedioMainVo vmv = new VedioMainVo();
		
		//视频类型
		List<ChannelCategoryVo> channelCategorys = channelCategoryService.getCategory(new ChannelCategoryQuery());
		
		//学习分类
		List<SubjectCategoryVo> subjectCategorys = subjectCategoryService.getCategory(new SubjectCategoryQuery());
		//首页视频list 根据 是否显示在首页查询
		List<VedioVo> vos = findVedios(query);
		for (VedioVo vedioVo : vos) {
			
			if(0 == vedioVo.getCarouselFigure()){//加入轮播图
				vmv.getCarouselFigureVedios().add(vedioVo);
//				continue;
			}
			
			for (ChannelCategoryVo channelVo : channelCategorys) {
				//类型与视频匹配
				if(vedioVo.getChannelId() == channelVo.getId()){
					channelVo.getVedios().add(vedioVo);
				}
			}
			
			for (SubjectCategoryVo subjectVo : subjectCategorys) {
				//类型与视频匹配
				if(vedioVo.getSubjectId() == subjectVo.getId()){
					subjectVo.getVedios().add(vedioVo);
				}
			}
		}
		vmv.setSubs(subjectCategorys);
		vmv.setChannels(channelCategorys);
		return vmv;
	}
	
	

}
