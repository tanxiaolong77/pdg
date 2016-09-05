/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.CommentSupport;
import com.quanjing.model.platform.VedioInfoSupport;
import com.quanjing.platform.dao.CommentSupportDao;
import com.quanjing.platform.query.CommentSupportQuery;
import com.quanjing.platform.query.VedioInfoSupportQuery;
import com.quanjing.platform.service.CommentSupportService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;
import com.quanjing.util.ActResult;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("commentSupportService")
public class CommentSupportServiceImpl extends BaseService<CommentSupport,java.lang.Long> implements CommentSupportService {
	
	@Autowired
	private CommentSupportDao commentSupportDao;
	
	public EntityDao getEntityDao() {
		return this.commentSupportDao;
	}
	
	public PageInfo findPage(CommentSupportQuery query){
		PageHelper.startPage(query);
		return new PageInfo(commentSupportDao.findPage(query));
	}
	
	public ActResult addCommentSupport(CommentSupport entity) throws DataAccessException{
		
		CommentSupportQuery query = new CommentSupportQuery();
		query.setCommentId(entity.getCommentId());
		query.setUserId(entity.getUserId());
		Long hasExists = commentSuppotCount(query);
		if(hasExists > 0)
			return ActResult.fail("已存在点赞");
		
		int rst = commentSupportDao.insert(entity);
		if(rst > 0){
			return ActResult.successSetMsg("评论点赞成功");
		}
		return ActResult.fail("评论点赞失败");
		
	}
	
	public Long commentSuppotCount(CommentSupportQuery query){
		return commentSupportDao.findCount(query);
	}

}
