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
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pdg.model.Article;
import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.vo.ChannelCategoryVo;
import com.quanjing.model.platform.vo.SubjectCategoryVo;
import com.quanjing.model.platform.vo.VedioMainVo;
import com.quanjing.model.platform.vo.VedioVo;
import com.quanjing.pdg.dao.ArticleDao;
import com.quanjing.platform.query.ArticleQuery;
import com.quanjing.platform.query.ChannelCategoryQuery;
import com.quanjing.platform.query.SubjectCategoryQuery;
import com.quanjing.platform.query.VedioQuery;
import com.quanjing.platform.service.ArticleService;
import com.quanjing.platform.service.ChannelCategoryService;
import com.quanjing.platform.service.ImageService;
import com.quanjing.platform.service.SubjectCategoryService;
import com.quanjing.platform.service.UserService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;

@Service("articleService")
public class ArticleServiceImpl extends BaseService<Article, java.lang.Long>implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	public EntityDao getEntityDao() {
		return this.articleDao;
	}

	@Override
	public PageInfo findPage(ArticleQuery query) {
		PageHelper.startPage(query);
		List<Article> findPage = articleDao.findPage(query);
		return new PageInfo(findPage);
	}

}