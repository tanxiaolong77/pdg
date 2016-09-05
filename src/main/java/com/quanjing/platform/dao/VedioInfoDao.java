/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.VedioInfo;
import com.quanjing.platform.query.VedioInfoQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface VedioInfoDao extends EntityDao<VedioInfo,java.lang.Long>{
	
	
	public List findPage(VedioInfoQuery query);
	

}
