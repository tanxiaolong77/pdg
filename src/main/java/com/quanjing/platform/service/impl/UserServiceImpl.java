/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Image;
import com.quanjing.model.platform.User;
import com.quanjing.model.platform.vo.UserVo;
import com.quanjing.platform.dao.UserDao;
import com.quanjing.platform.query.UserQuery;
import com.quanjing.platform.service.ImageService;
import com.quanjing.platform.service.UserService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("userService")
public class UserServiceImpl extends BaseService<User,java.lang.Long> implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	@Qualifier("imageService")
	private ImageService imageService;
	
	public EntityDao getEntityDao() {
		return this.userDao;
	}
	
	public PageInfo findPage(UserQuery query){
		PageHelper.startPage(query);
		return new PageInfo(userDao.findPage(query));
	}
	
	public UserVo getById(Long id){
		UserVo vo = (UserVo)userDao.getById(id);
		if(null != vo.getPic())
			vo.setPicUrl(imageService.getById(vo.getPic()).getUrl());
		return vo;
	}

}
