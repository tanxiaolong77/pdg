/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.VedioInfo;
import com.quanjing.model.platform.vo.VedioInfoVo;
import com.quanjing.platform.query.VedioInfoQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;


public interface VedioInfoService extends EntityService<VedioInfo,java.lang.Long>{
	
	
	public PageInfo findPage(VedioInfoQuery query);
	
	public VedioInfoVo findVedioInfo(VedioInfoQuery query);
	

}
