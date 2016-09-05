/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.CommentSupport;
import com.quanjing.platform.query.CommentSupportQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface CommentSupportDao extends EntityDao<CommentSupport,java.lang.Long>{
	
	
	public List findPage(CommentSupportQuery query);
	
	public Long findCount(CommentSupportQuery query);
	

}
