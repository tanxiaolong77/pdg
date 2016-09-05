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

import com.quanjing.model.platform.User;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class UserQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** 昵称 **/
		private java.lang.String nickName;
		/** 登录名 **/
		private java.lang.String username;
		/** 真实名称 **/
		private java.lang.String realName;
		/** 密码 **/
		private java.lang.String password;
		/** 电话 **/
		private java.lang.String phone;
		/** 0:未知  1：男 2：女 **/
		private java.lang.Integer gender;
		/** 生日 **/
		private java.util.Date birthday;
		/** 创建时间 **/
		private java.util.Date createTime;
		/** 0有效 1无效 **/
		private java.lang.Integer status;
		//columns END


		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setNickName(java.lang.String value) {
			this.nickName = value;
		}
		
		public java.lang.String getNickName() {
			return this.nickName;
		}

		public void setUsername(java.lang.String value) {
			this.username = value;
		}
		
		public java.lang.String getUsername() {
			return this.username;
		}

		public void setRealName(java.lang.String value) {
			this.realName = value;
		}
		
		public java.lang.String getRealName() {
			return this.realName;
		}

		public void setPassword(java.lang.String value) {
			this.password = value;
		}
		
		public java.lang.String getPassword() {
			return this.password;
		}

		public void setPhone(java.lang.String value) {
			this.phone = value;
		}
		
		public java.lang.String getPhone() {
			return this.phone;
		}

		public void setGender(java.lang.Integer value) {
			this.gender = value;
		}
		
		public java.lang.Integer getGender() {
			return this.gender;
		}

		public void setBirthday(java.util.Date value) {
			this.birthday = value;
		}
		
		public java.util.Date getBirthday() {
			return this.birthday;
		}

		public void setCreateTime(java.util.Date value) {
			this.createTime = value;
		}
		
		public java.util.Date getCreateTime() {
			return this.createTime;
		}

		public void setStatus(java.lang.Integer value) {
			this.status = value;
		}
		
		public java.lang.Integer getStatus() {
			return this.status;
		}

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("NickName",getNickName())
				.append("Username",getUsername())
				.append("RealName",getRealName())
				.append("Password",getPassword())
				.append("Phone",getPhone())
				.append("Gender",getGender())
				.append("Birthday",getBirthday())
				.append("CreateTime",getCreateTime())
				.append("Status",getStatus())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof User == false) return false;
			if(this == obj) return true;
			UserQuery other = (UserQuery)obj;
			return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
		}
	}

