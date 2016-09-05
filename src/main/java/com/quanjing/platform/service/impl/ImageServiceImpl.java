/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Image;
import com.quanjing.platform.dao.ImageDao;
import com.quanjing.platform.query.ImageQuery;
import com.quanjing.platform.service.ImageService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("imageService")
public class ImageServiceImpl extends BaseService<Image,java.lang.Long> implements ImageService {
	
	@Autowired
	private ImageDao imageDao;
	
	public EntityDao getEntityDao() {
		return this.imageDao;
	}
	
	public PageInfo findPage(ImageQuery query){
		PageHelper.startPage(query);
		return new PageInfo(imageDao.findPage(query));
	}

}
