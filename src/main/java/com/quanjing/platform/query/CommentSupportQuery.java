/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.query;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.quanjing.model.platform.CommentSupport;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class CommentSupportQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** userId **/
		private java.lang.Long userId;
		/** createTime **/
		private java.util.Date createTime;
		/** vedioInfoId **/
		private java.lang.Long commentId;
		//columns END
		
		public void clear(){
			this.id = null;
			this.userId = null;
			this.createTime = null;
			this.commentId = null;
		}


		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setUserId(java.lang.Long value) {
			this.userId = value;
		}
		
		public java.lang.Long getUserId() {
			return this.userId;
		}

		public void setCreateTime(java.util.Date value) {
			this.createTime = value;
		}
		
		public java.util.Date getCreateTime() {
			return this.createTime;
		}

		public void setCommentId(java.lang.Long value) {
			this.commentId = value;
		}
		
		public java.lang.Long getCommentId() {
			return this.commentId;
		}

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("UserId",getUserId())
				.append("CreateTime",getCreateTime())
				.append("CommentId",getCommentId())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof CommentSupport == false) return false;
			if(this == obj) return true;
			CommentSupportQuery other = (CommentSupportQuery)obj;
			return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
		}
	}

