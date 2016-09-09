/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.pdg.dao;

import com.pdg.model.SysUser;
import com.quanjing.platform.service.base.EntityDao;


public interface SysUserDao extends EntityDao<SysUser,java.lang.Long>{
	
	
	public SysUser getByUsername(String username);
	
}
