/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.pdg.model.Article;
import com.quanjing.platform.service.base.EntityService;


public interface ArticleService extends EntityService<Article,java.lang.Long>{
	
	
	public PageInfo findPage(Map query);
	
}
