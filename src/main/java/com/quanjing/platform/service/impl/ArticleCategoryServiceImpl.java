/*
 * Powered By [rapid-framework]
 * Since 2008 - 2015
 */

package com.quanjing.platform.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pdg.model.ArticleCategory;
import com.quanjing.pdg.dao.ArticleCategoryDao;
import com.quanjing.platform.query.ArticleCategoryQuery;
import com.quanjing.platform.service.ArticleCategoryService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

@Service("articleCategoryService")
public class ArticleCategoryServiceImpl extends BaseService<ArticleCategory,java.lang.Long> implements  ArticleCategoryService{
	@Autowired
	@Qualifier("articleCategoryDao")
	private ArticleCategoryDao articleCategoryDao;
	
	public EntityDao getEntityDao() {
		return this.articleCategoryDao;
	}
	
	public PageInfo findPage(ArticleCategoryQuery query) {
		
		PageHelper.startPage(query);
		List<ArticleCategory> list = articleCategoryDao.findPage(query);
		return new PageInfo<ArticleCategory>(list);
		
	}

	@Override
	public List<ArticleCategory> hotTag() {
		return articleCategoryDao.hotTag();
	}
	
}
