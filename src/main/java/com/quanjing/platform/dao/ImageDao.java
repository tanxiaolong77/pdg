/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.Image;
import com.quanjing.platform.query.ImageQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface ImageDao extends EntityDao<Image,java.lang.Long>{
	
	
	public List findPage(ImageQuery query);
	

}
