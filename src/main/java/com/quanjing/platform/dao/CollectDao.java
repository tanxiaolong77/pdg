/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.Collect;
import com.quanjing.platform.query.CollectQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface CollectDao extends EntityDao<Collect,java.lang.Long>{
	
	
	public List findPage(CollectQuery query);
	
	public Long findCount(CollectQuery query);
	

}
