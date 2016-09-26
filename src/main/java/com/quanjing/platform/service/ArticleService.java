/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.pdg.model.Article;
import com.pdg.vo.ArticleVo;
import com.pdg.vo.MainVo;
import com.quanjing.platform.query.ArticleQuery;
import com.quanjing.platform.service.base.EntityService;


public interface ArticleService extends EntityService<Article,java.lang.Long>{
	
	
	public PageInfo findPage(Map query);
	
	public List findPage(ArticleQuery query);
	
	public ArticleVo getById(Long id);
	
	public List<Article> getByCategoryId(Long categoryId);
	
	public MainVo schoolEnvironment();
	
}
