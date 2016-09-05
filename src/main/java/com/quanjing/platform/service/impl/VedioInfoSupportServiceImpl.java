/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.VedioInfoSupport;
import com.quanjing.platform.dao.VedioInfoSupportDao;
import com.quanjing.platform.query.VedioInfoSupportQuery;
import com.quanjing.platform.service.VedioInfoService;
import com.quanjing.platform.service.VedioInfoSupportService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;
import com.quanjing.util.ActResult;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("vedioInfoSupportService")
public class VedioInfoSupportServiceImpl extends BaseService<VedioInfoSupport,java.lang.Long> implements VedioInfoSupportService {
	
	@Autowired
	private VedioInfoSupportDao vedioInfoSupportDao;
	
	public EntityDao getEntityDao() {
		return this.vedioInfoSupportDao;
	}
	
	public PageInfo findPage(VedioInfoSupportQuery query){
		PageHelper.startPage(query);
		return new PageInfo(vedioInfoSupportDao.findPage(query));
	}
	
	public ActResult addVedioInfoSupprt(VedioInfoSupport entity) throws DataAccessException{
		
		VedioInfoSupportQuery query = new VedioInfoSupportQuery();
		query.setVedioInfoId(entity.getVedioInfoId());
		query.setUserId(entity.getUserId());
		
		if(vedioInfoSupportDao.findCount(query) > 0){
			return ActResult.fail("已点赞,不能再次点赞");
		}
		
		int rst = vedioInfoSupportDao.insert(entity);
		if(rst > 0){
			return ActResult.successSetMsg("视频详细点赞成功");
		}
		return ActResult.fail("视频详细点赞失败");
		
	}
	
	public Long vedioInfoSuppporCount(VedioInfoSupportQuery query){
		return vedioInfoSupportDao.findCount(query);
	}

	
}
