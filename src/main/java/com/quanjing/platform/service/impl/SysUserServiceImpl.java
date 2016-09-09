package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdg.model.Article;
import com.pdg.model.SysUser;
import com.quanjing.pdg.dao.SysUserDao;
import com.quanjing.platform.service.SysUserService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

@Service("sysUserService")
public class SysUserServiceImpl extends BaseService<SysUser, java.lang.Long> implements SysUserService{

	@Autowired
	private SysUserDao sysUserDao;
	
	@Override
	protected EntityDao getEntityDao() {
		return sysUserDao;
	}

	@Override
	public SysUser checkUser(String username, String password) {
		SysUser sysUser = sysUserDao.getByUsername(username);
		
		return null;
	}

}
