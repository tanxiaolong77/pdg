/*
 * Powered By [rapid-framework]
 * Since 2008 - 2015
 */

package com.quanjing.platform.service;

import com.github.pagehelper.PageInfo;
import com.pdg.model.ArticleCategory;
import com.quanjing.platform.query.ArticleCategoryQuery;
import com.quanjing.platform.service.base.EntityService;

public interface ArticleCategoryService extends EntityService<ArticleCategory,Long>{
	
	
	public PageInfo findPage(ArticleCategoryQuery query);
	
}
