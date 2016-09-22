package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdg.vo.MainVo;
import com.quanjing.platform.query.ArticleQuery;
import com.quanjing.platform.service.ArticleCategoryService;
import com.quanjing.platform.service.ArticleService;
import com.quanjing.platform.service.MainService;

@Service("mainService")
public class MainServiceImpl implements MainService{

	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private ArticleCategoryService categoryService;
	


	public MainVo mainView() {
		MainVo resultVo = new MainVo();
		
		/***
		 * 学校动态 主页默认显示8条
		 */
		ArticleQuery articleQuery = new ArticleQuery();
		articleQuery.setSortColumns("create_time desc");
		articleQuery.setCategoryId(1L);
		articleQuery.setPageNum(1);
		articleQuery.setPageSize(8);
		resultVo.setSchoolDynamic(articleService.findPage(articleQuery));
		
		/***
		 * 行业新闻 主页默认显示8条
		 */
		articleQuery.setCategoryId(2L);
		articleQuery.setPageSize(8);
		articleQuery.setPageNum(0);
		resultVo.setIndustryNews(articleService.findPage(articleQuery));
		
		/***
		 * 往期学子 主页默认显示5条
		 */
		articleQuery.setCategoryId(16L);
		articleQuery.setPageSize(5);
		articleQuery.setPageNum(0);
		resultVo.setFormerStudent(articleService.findPage(articleQuery));
		
		/***
		 * 学校环境 主页默认显示7条
		 */
		articleQuery.setCategoryId(6L);
		articleQuery.setPageSize(7);
		articleQuery.setPageNum(0);
		resultVo.setSchoolEnvironment(articleService.findPage(articleQuery));
		
		/***
		 * 招生问答 主页默认显示4条
		 */
		articleQuery.setCategoryId(17L);
		articleQuery.setPageSize(4);
		articleQuery.setPageNum(0);
		resultVo.setFAQs(articleService.findPage(articleQuery));
		
		/***
		 * 新闻报道 主页默认显示4条
		 */
		articleQuery.setCategoryId(8L);
		articleQuery.setPageSize(4);
		articleQuery.setPageNum(0);
		resultVo.setNewsReport(articleService.findPage(articleQuery));
		
		/***
		 * 学子心声 主页默认显示4条
		 */
		articleQuery.setCategoryId(9L);
		articleQuery.setPageSize(4);
		articleQuery.setPageNum(0);
		resultVo.setStudentsThoughts(articleService.findPage(articleQuery));
		
		/***
		 *美容交流  主页默认显示20条
		 */
		articleQuery.setCategoryId(10L);
		articleQuery.setPageSize(20);
		articleQuery.setPageNum(0);
		resultVo.setCosmetology(articleService.findPage(articleQuery));
		
		/***
		 *宠物医疗  主页默认显示20条
		 */
		articleQuery.setCategoryId(11L);
		articleQuery.setPageSize(20);
		articleQuery.setPageNum(0);
		resultVo.setPetCare(articleService.findPage(articleQuery));
		
		/***
		 *宠物饲养   主页默认显示20条
		 */
		articleQuery.setCategoryId(12L);
		articleQuery.setPageSize(20);
		articleQuery.setPageNum(0);
		resultVo.setPetRaising(articleService.findPage(articleQuery));
		
		/***
		 *宠物新闻   主页默认显示20条
		 */
		articleQuery.setCategoryId(13L);
		articleQuery.setPageSize(20);
		articleQuery.setPageNum(0);
		resultVo.setPetNews(articleService.findPage(articleQuery));
		
		/***
		 *宠物热点   主页默认显示20条
		 */
		articleQuery.setCategoryId(14L);
		articleQuery.setPageSize(20);
		articleQuery.setPageNum(0);
		resultVo.setPetHotSpots(articleService.findPage(articleQuery));
		
		return resultVo;
	}

	
}
