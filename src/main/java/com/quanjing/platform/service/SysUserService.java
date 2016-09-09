/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import com.pdg.model.SysUser;
import com.quanjing.platform.service.base.EntityService;


public interface SysUserService extends EntityService<SysUser,java.lang.Long>{
	
	
	public SysUser checkUser(String username, String password);
}
