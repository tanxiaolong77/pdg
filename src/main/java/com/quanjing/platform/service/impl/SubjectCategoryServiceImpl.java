/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.SubjectCategory;
import com.quanjing.platform.dao.SubjectCategoryDao;
import com.quanjing.platform.query.SubjectCategoryQuery;
import com.quanjing.platform.service.SubjectCategoryService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("subjectCategoryService")
public class SubjectCategoryServiceImpl extends BaseService<SubjectCategory,java.lang.Long> implements SubjectCategoryService {
	
	@Autowired
	private SubjectCategoryDao subjectCategoryDao;
	
	public EntityDao getEntityDao() {
		return this.subjectCategoryDao;
	}
	
	public PageInfo findPage(SubjectCategoryQuery query){
		PageHelper.startPage(query);
		return new PageInfo(subjectCategoryDao.findPage(query));
	}
	
	public List getCategory(SubjectCategoryQuery query){
		return subjectCategoryDao.findPage(query);
	}

}
