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
import com.quanjing.model.platform.ChannelCategory;
import com.quanjing.platform.dao.ChannelCategoryDao;
import com.quanjing.platform.query.ChannelCategoryQuery;
import com.quanjing.platform.service.ChannelCategoryService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("channelCategoryService")
public class ChannelCategoryServiceImpl extends BaseService<ChannelCategory,java.lang.Long> implements ChannelCategoryService {
	
	@Autowired
	@Qualifier("channelCategoryDao")
	private ChannelCategoryDao channelCategoryDao;
	
	public EntityDao getEntityDao() {
		return this.channelCategoryDao;
	}
	
	public PageInfo findPage(ChannelCategoryQuery query){
		PageHelper.startPage(query);
		return new PageInfo(channelCategoryDao.findPage(query));
	}
	
	public List getCategory(ChannelCategoryQuery query){
		return channelCategoryDao.findPage(query);
	}

}
