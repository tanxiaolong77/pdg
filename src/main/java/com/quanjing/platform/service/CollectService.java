/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service;

import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.Collect;
import com.quanjing.platform.query.CollectQuery;
/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */
import com.quanjing.platform.service.base.EntityService;
import com.quanjing.util.ActResult;


public interface CollectService extends EntityService<Collect,java.lang.Long>{
	
	
	public PageInfo findPage(CollectQuery query);
	
	public ActResult addCollect(Collect entity);
	
	public Long findCount(CollectQuery query);
	

}
