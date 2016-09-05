/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.VedioInfo;
import com.quanjing.model.platform.vo.VedioInfoVo;
import com.quanjing.platform.dao.VedioInfoDao;
import com.quanjing.platform.query.CollectQuery;
import com.quanjing.platform.query.VedioInfoCommentQuery;
import com.quanjing.platform.query.VedioInfoQuery;
import com.quanjing.platform.query.VedioInfoSupportQuery;
import com.quanjing.platform.service.CollectService;
import com.quanjing.platform.service.VedioInfoCommentService;
import com.quanjing.platform.service.VedioInfoService;
import com.quanjing.platform.service.VedioInfoSupportService;
import com.quanjing.platform.service.VedioService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("vedioInfoService")
public class VedioInfoServiceImpl extends BaseService<VedioInfo,java.lang.Long> implements VedioInfoService {
	
	@Autowired
	private VedioInfoDao vedioInfoDao;
	
	@Autowired
	@Qualifier("vedioInfoCommentService")
	private VedioInfoCommentService vedioInfoCommentService;
	@Autowired
	@Qualifier("vedioInfoSupportService")
	private VedioInfoSupportService vedioInfoSupportService;
	@Autowired
	@Qualifier("vedioService")
	private VedioService vedioService;
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	
	public EntityDao getEntityDao() {
		return this.vedioInfoDao;
	}
	
	public PageInfo findPage(VedioInfoQuery query){
		PageHelper.startPage(query);
		return new PageInfo(vedioInfoDao.findPage(query));
	}
	
	public VedioInfoVo findVedioInfo(VedioInfoQuery query){
		VedioInfoVo vo = (VedioInfoVo)vedioInfoDao.getById(query.getId());
		if(null == vo){
			return null;
		}
		
		Vedio vedio = vedioService.getById(vo.getVedioId());
		if(null == vedio){
			return null;
		}
		
		/***
		 * 视频信息
		 */
		vo.setVedio(vedio);
		
		/***
		 * 收藏
		 */
		CollectQuery collectQuery = new CollectQuery();
		collectQuery.setUserId(query.getUserId());
		collectQuery.setVedioId(vo.getId());
		
		Long hasExists = collectService.findCount(collectQuery);
		vo.setCollectDisabled((hasExists > 0?true:false));
		
		/***
		 * 评论数
		 */
		VedioInfoCommentQuery vedioInfoCommentQuery = new VedioInfoCommentQuery();
		vedioInfoCommentQuery.setVedioInfoId(query.getId());
		vo.setCommentCount(vedioInfoCommentService.commentCount(vedioInfoCommentQuery));
		
		/***
		 * 视频详细点赞数
		 */
		VedioInfoSupportQuery vedioInfoSupportQuery = new VedioInfoSupportQuery();
		vedioInfoSupportQuery.setVedioInfoId(query.getId());
		vo.setSupportCount(vedioInfoSupportService.vedioInfoSuppporCount(vedioInfoSupportQuery));
		
		/***
		 * 当前登录人是否已经点过赞
		 */
		vedioInfoSupportQuery.setUserId(query.getUserId());
		Long rst = vedioInfoSupportService.vedioInfoSuppporCount(vedioInfoSupportQuery);
		vo.setSupportDisabled((rst > 0?true:false));
		

		return vo;
	}
	


}
