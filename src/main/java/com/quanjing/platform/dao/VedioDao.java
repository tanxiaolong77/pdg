/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.Vedio;
import com.quanjing.model.platform.vo.VedioVo;
import com.quanjing.platform.query.VedioQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface VedioDao extends EntityDao<Vedio,java.lang.Long>{
	
	
	public List<VedioVo> findPage(VedioQuery query);
	

}
