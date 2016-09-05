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

import com.quanjing.model.platform.ChannelSetting;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class ChannelSettingQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** banner图 **/
		private java.lang.Long bannerImageId;
		/** 创建人 **/
		private java.lang.Long createUser;
		/** 创建时间 **/
		private java.util.Date createTime;
		/** 修改时间 **/
		private java.util.Date updateTime;
		/** 修改人 **/
		private java.lang.Long updateUser;
		//columns END


		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setBannerImageId(java.lang.Long value) {
			this.bannerImageId = value;
		}
		
		public java.lang.Long getBannerImageId() {
			return this.bannerImageId;
		}

		public void setCreateUser(java.lang.Long value) {
			this.createUser = value;
		}
		
		public java.lang.Long getCreateUser() {
			return this.createUser;
		}

		public void setCreateTime(java.util.Date value) {
			this.createTime = value;
		}
		
		public java.util.Date getCreateTime() {
			return this.createTime;
		}

		public void setUpdateTime(java.util.Date value) {
			this.updateTime = value;
		}
		
		public java.util.Date getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateUser(java.lang.Long value) {
			this.updateUser = value;
		}
		
		public java.lang.Long getUpdateUser() {
			return this.updateUser;
		}

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("BannerImageId",getBannerImageId())
				.append("CreateUser",getCreateUser())
				.append("CreateTime",getCreateTime())
				.append("UpdateTime",getUpdateTime())
				.append("UpdateUser",getUpdateUser())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof ChannelSetting == false) return false;
			if(this == obj) return true;
			ChannelSettingQuery other = (ChannelSettingQuery)obj;
			return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
		}
	}

