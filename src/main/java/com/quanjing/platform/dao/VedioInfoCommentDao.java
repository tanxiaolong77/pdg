/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.dao;

import java.util.List;

import com.quanjing.model.platform.VedioInfoComment;
import com.quanjing.model.platform.vo.VedioInfoCommentVo;
import com.quanjing.platform.query.VedioInfoCommentQuery;
import com.quanjing.platform.service.base.EntityDao;


public interface VedioInfoCommentDao extends EntityDao<VedioInfoComment,java.lang.Long>{
	
	
	public List<VedioInfoCommentVo> findPage(VedioInfoCommentQuery query);
	
	public Long findCount(VedioInfoCommentQuery query);
	

}
