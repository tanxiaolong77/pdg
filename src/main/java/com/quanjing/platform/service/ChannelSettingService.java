/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.ChannelSetting;
import com.quanjing.platform.query.ChannelSettingQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;


public interface ChannelSettingService extends EntityService<ChannelSetting,java.lang.Long>{
	
	
	public PageInfo findPage(ChannelSettingQuery query);
	

}
