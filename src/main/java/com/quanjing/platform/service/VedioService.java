/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.vo.VedioMainVo;
import com.quanjing.model.platform.vo.VedioVo;
import com.quanjing.platform.query.VedioQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;


public interface VedioService extends EntityService<Vedio,java.lang.Long>{
	
	
	public PageInfo findPage(VedioQuery query);
	
	public VedioMainVo mainVedios(VedioQuery query);
	
	public List  findVedios(VedioQuery query);
	
	public VedioVo getById(Long id);

}
