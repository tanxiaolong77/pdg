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
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Collect;
import com.quanjing.model.platform.vo.CollectVo;
import com.quanjing.platform.dao.CollectDao;
import com.quanjing.platform.query.CollectQuery;
import com.quanjing.platform.service.ChannelCategoryService;
import com.quanjing.platform.service.CollectService;
import com.quanjing.platform.service.VedioService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;
import com.quanjing.util.ActResult;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("collectService")
public class CollectServiceImpl extends BaseService<Collect,java.lang.Long> implements CollectService {
	
	@Autowired
	private CollectDao collectDao;
	@Autowired
	@Qualifier("channelCategoryService")
	private ChannelCategoryService channelCategoryService;
	@Autowired
	@Qualifier("vedioService")
	private VedioService vedioService;
	
	public EntityDao getEntityDao() {
		return this.collectDao;
	}
	
	public PageInfo findPage(CollectQuery query){
		PageHelper.startPage(query);
		List<CollectVo> vos = collectDao.findPage(query);
		for (CollectVo vo : vos) {
			vo.setVedio(vedioService.getById(vo.getVedioId()));
		}
		return new PageInfo(vos);
	}
	
	public ActResult addCollect(Collect entity) throws DataAccessException{
		
		CollectQuery query = new CollectQuery();
		query.setUserId(entity.getUserId());
		query.setVedioId(entity.getVedioId());
		
		Long hasExists = findCount(query);
		if(hasExists > 0)
			return ActResult.fail("已经存在此收藏，不能再次收藏");
		
		int rst = collectDao.insert(entity);
		if(rst > 0){
			return ActResult.successSetMsg("收藏成功");
		}
		return ActResult.fail("收藏失败");
	}
	
	public Long findCount(CollectQuery query){
		return collectDao.findCount(query);
	}
	
	

}
