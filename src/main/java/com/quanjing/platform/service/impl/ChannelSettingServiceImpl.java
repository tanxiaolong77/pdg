/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.ChannelSetting;
import com.quanjing.platform.dao.ChannelSettingDao;
import com.quanjing.platform.query.ChannelSettingQuery;
import com.quanjing.platform.service.ChannelSettingService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("channelSettingService")
public class ChannelSettingServiceImpl extends BaseService<ChannelSetting,java.lang.Long> implements ChannelSettingService {
	
	@Autowired
	private ChannelSettingDao channelSettingDao;
	
	public EntityDao getEntityDao() {
		return this.channelSettingDao;
	}
	
	public PageInfo findPage(ChannelSettingQuery query){
		PageHelper.startPage(query);
		return new PageInfo(channelSettingDao.findPage(query));
	}
	
	public ChannelSetting findChannelSetting(){
		List<ChannelSetting> rst = channelSettingDao.findPage(new ChannelSettingQuery());
		if(null != rst && rst.size() > 0)
			return rst.get(0);
		return null;
	}

}
