/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanjing.model.platform.VedioInfoComment;
import com.quanjing.model.platform.vo.UserVo;
import com.quanjing.model.platform.vo.VedioInfoCommentVo;
import com.quanjing.platform.dao.VedioInfoCommentDao;
import com.quanjing.platform.query.CommentSupportQuery;
import com.quanjing.platform.query.VedioInfoCommentQuery;
import com.quanjing.platform.service.CommentSupportService;
import com.quanjing.platform.service.UserService;
import com.quanjing.platform.service.VedioInfoCommentService;
import com.quanjing.platform.service.base.BaseService;
import com.quanjing.platform.service.base.EntityDao;
import com.quanjing.util.ActResult;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */



@Service("vedioInfoCommentService")
public class VedioInfoCommentServiceImpl extends BaseService<VedioInfoComment,java.lang.Long> implements VedioInfoCommentService {
	
	@Autowired
	private VedioInfoCommentDao vedioInfoCommentDao;
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	@Autowired
	@Qualifier("commentSupportService")
	private CommentSupportService commentSupportService;
	
	public EntityDao getEntityDao() {
		return this.vedioInfoCommentDao;
	}
	
	public PageInfo findPage(VedioInfoCommentQuery query){
		PageHelper.startPage(query);
		query.setSortColumns("create_time desc");
		List<VedioInfoCommentVo> vos = vedioInfoCommentDao.findPage(query);
		Date currentTime = new Date(System.currentTimeMillis());
		CommentSupportQuery commentSupportQuery = new CommentSupportQuery();

		for (VedioInfoCommentVo vo : vos) {
			vo.setUser((UserVo)userService.getById(vo.getCreateUser()));
			vo.setPublishTime(publishTime(currentTime,vo.getCreateTime()));
			
			//评论 点赞数
			commentSupportQuery.setCommentId(vo.getId());
			vo.setSupportCount(commentSupportService.commentSuppotCount(commentSupportQuery));
			
			//当前登录人是否已经对该评论点过赞
			commentSupportQuery.setUserId(query.getUserId());
			Long rst = commentSupportService.commentSuppotCount(commentSupportQuery);
			vo.setSupportDisabled((rst > 0?true:false));
			
			commentSupportQuery.clear();
		}
		

		return new PageInfo(vos);
	}
	
	public static String publishTime(Date currentDateTime,Date publishTime){
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   java.util.Date now;
		try {

		   long l=currentDateTime.getTime()-publishTime.getTime();
		   long day=l/(24*60*60*1000);
		   long hour=(l/(60*60*1000)-day*24);
		   long min=((l/(60*1000))-day*24*60-hour*60);
		   long s=(l/1000-day*24*60*60-hour*60*60-min*60);
		   
		   StringBuffer sb = new StringBuffer();
		   if(day > 0)
			   sb.append(day+"天");
		   else if(hour > 0 )
			   sb.append(hour+"小时");
		   else if(min > 0 )
			   sb.append(min+"分钟");
		   else
			   sb.append(s+"秒");
		   sb.append("前");
		   return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public ActResult addComment(VedioInfoComment entity) throws DataAccessException{
		int rst = vedioInfoCommentDao.insert(entity);
		if(rst > 0){
			VedioInfoCommentVo rstEntity = new VedioInfoCommentVo();
			rstEntity.setId(entity.getId());
			rstEntity.setPublishTime("刚刚");
			return ActResult.success(rstEntity);
		}
		return ActResult.fail("评论失败");
	}
	
	public Long commentCount(VedioInfoCommentQuery query){
		return vedioInfoCommentDao.findCount(query);
	}

}
