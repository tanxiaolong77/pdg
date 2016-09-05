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

import com.quanjing.model.platform.VedioInfoComment;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioInfoCommentQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** vedioInfoId **/
		private java.lang.Long vedioInfoId;
		/** vedioId **/
		private java.lang.Long vedioId;
		/** content **/
		private java.lang.String content;
		/** createTime **/
		private java.util.Date createTime;
		/** createUser **/
		private java.lang.Long createUser;
		//columns END

		private java.lang.Long userId;

		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setVedioInfoId(java.lang.Long value) {
			this.vedioInfoId = value;
		}
		
		public java.lang.Long getVedioInfoId() {
			return this.vedioInfoId;
		}

		public void setVedioId(java.lang.Long value) {
			this.vedioId = value;
		}
		
		public java.lang.Long getVedioId() {
			return this.vedioId;
		}

		public void setContent(java.lang.String value) {
			this.content = value;
		}
		
		public java.lang.String getContent() {
			return this.content;
		}

		public void setCreateTime(java.util.Date value) {
			this.createTime = value;
		}
		
		public java.util.Date getCreateTime() {
			return this.createTime;
		}

		public void setCreateUser(java.lang.Long value) {
			this.createUser = value;
		}
		
		public java.lang.Long getCreateUser() {
			return this.createUser;
		}

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("VedioInfoId",getVedioInfoId())
				.append("VedioId",getVedioId())
				.append("Content",getContent())
				.append("CreateTime",getCreateTime())
				.append("CreateUser",getCreateUser())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof VedioInfoComment == false) return false;
			if(this == obj) return true;
			VedioInfoCommentQuery other = (VedioInfoCommentQuery)obj;
			return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
		}

		public java.lang.Long getUserId() {
			return userId;
		}

		public void setUserId(java.lang.Long userId) {
			this.userId = userId;
		}
	}

