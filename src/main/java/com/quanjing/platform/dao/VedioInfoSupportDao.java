/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;
import java.util.List;

import com.quanjing.model.platform.VedioInfoSupport;
import com.quanjing.platform.query.VedioInfoSupportQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface VedioInfoSupportDao extends EntityDao<VedioInfoSupport,java.lang.Long>{
	
	
	public List findPage(VedioInfoSupportQuery query);
	
	public Long findCount(VedioInfoSupportQuery query);
	

}
