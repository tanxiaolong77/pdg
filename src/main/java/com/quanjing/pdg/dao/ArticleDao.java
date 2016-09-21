/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.pdg.dao;

import java.util.List;
import java.util.Map;

import com.pdg.model.Article;
import com.quanjing.platform.query.ArticleQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface ArticleDao extends EntityDao<Article,java.lang.Long>{
	
	
	public List<Article> findPage(Map query);
	

	public List<Article> findPage(ArticleQuery query);
}
