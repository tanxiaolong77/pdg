/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.VedioInfoSupport;
import com.quanjing.platform.query.VedioInfoSupportQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;
import com.quanjing.util.ActResult;


public interface VedioInfoSupportService extends EntityService<VedioInfoSupport,java.lang.Long>{
	
	
	public PageInfo findPage(VedioInfoSupportQuery query);
	
	public ActResult addVedioInfoSupprt(VedioInfoSupport entity);
	
	public Long vedioInfoSuppporCount(VedioInfoSupportQuery query);
	

}
