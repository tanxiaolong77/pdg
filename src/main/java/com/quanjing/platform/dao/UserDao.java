/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.User;
import com.quanjing.platform.query.UserQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface UserDao extends EntityDao<User,java.lang.Long>{
	
	
	public List findPage(UserQuery query);
	

}
