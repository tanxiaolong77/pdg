/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.ChannelCategory;
import com.quanjing.platform.query.ChannelCategoryQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;


public interface ChannelCategoryService extends EntityService<ChannelCategory,java.lang.Long>{
	
	
	public PageInfo findPage(ChannelCategoryQuery query);
	
	public List getCategory(ChannelCategoryQuery query);
	

}
