package com.quanjing.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.pdg.model.Article;
import com.quanjing.pdg.dao.ArticleDao;
import com.quanjing.platform.query.ArticleQuery;
import com.quanjing.platform.service.ArticleService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

@Service("articleService")
public class ArticleServiceImpl extends BaseService<Article, java.lang.Long> implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	protected EntityDao getEntityDao() {
		return articleDao;
	}

	@Override
	public PageInfo findPage(ArticleQuery query) {
		
		List<Article> list = articleDao.findPage(query);
		return new PageInfo(list);
	}
	
	
}
