package com.quanjing.pdg.dao;

import java.util.List;

import com.pdg.model.ArticleCategory;
import com.quanjing.platform.query.ArticleCategoryQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface ArticleCategoryDao extends  EntityDao<ArticleCategory,java.lang.Long>{
	
	public List<ArticleCategory> findPage(ArticleCategoryQuery query);

	public List<ArticleCategory> findAll();
	
	public List<ArticleCategory> hotTag();

}
