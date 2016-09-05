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

import com.quanjing.model.platform.Vedio;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** subjectId **/
		private java.lang.Long subjectId;
		/** 频道 **/
		private java.lang.Long channelId;
		/** 详细 **/
		private java.lang.Long infoId;
		/** 视频类型(flv,mp4..) **/
		private java.lang.String vedioType;
		/** 时长 **/
		private java.lang.Integer footage;
		/** 无状态视频：0，新视频:11,热点视频:22 **/
		private java.lang.Integer tab;
		/** 主标题 **/
		private java.lang.String title;
		/** 子标题 **/
		private java.lang.String ctitle;
		/** 封面图片 **/
		private java.lang.Long imageId;
		/** 主页视频：0，非主页视频：1 **/
		private java.lang.Integer homePage;
		/** 轮播图视频：0，非轮播图视频：1 **/
		private java.lang.Integer carouselFigure;
		/** 上传人 **/
		private java.lang.Long createUser;
		/** 上传时间 **/
		private java.util.Date createTime;
		//columns END


		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setSubjectId(java.lang.Long value) {
			this.subjectId = value;
		}
		
		public java.lang.Long getSubjectId() {
			return this.subjectId;
		}

		public void setChannelId(java.lang.Long value) {
			this.channelId = value;
		}
		
		public java.lang.Long getChannelId() {
			return this.channelId;
		}

		public void setInfoId(java.lang.Long value) {
			this.infoId = value;
		}
		
		public java.lang.Long getInfoId() {
			return this.infoId;
		}

		public void setVedioType(java.lang.String value) {
			this.vedioType = value;
		}
		
		public java.lang.String getVedioType() {
			return this.vedioType;
		}

		public void setFootage(java.lang.Integer value) {
			this.footage = value;
		}
		
		public java.lang.Integer getFootage() {
			return this.footage;
		}

		public void setTab(java.lang.Integer value) {
			this.tab = value;
		}
		
		public java.lang.Integer getTab() {
			return this.tab;
		}

		public void setTitle(java.lang.String value) {
			this.title = value;
		}
		
		public java.lang.String getTitle() {
			return this.title;
		}

		public void setCtitle(java.lang.String value) {
			this.ctitle = value;
		}
		
		public java.lang.String getCtitle() {
			return this.ctitle;
		}

		public void setImageId(java.lang.Long value) {
			this.imageId = value;
		}
		
		public java.lang.Long getImageId() {
			return this.imageId;
		}

		public void setHomePage(java.lang.Integer value) {
			this.homePage = value;
		}
		
		public java.lang.Integer getHomePage() {
			return this.homePage;
		}

		public void setCarouselFigure(java.lang.Integer value) {
			this.carouselFigure = value;
		}
		
		public java.lang.Integer getCarouselFigure() {
			return this.carouselFigure;
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

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("SubjectId",getSubjectId())
				.append("ChannelId",getChannelId())
				.append("InfoId",getInfoId())
				.append("VedioType",getVedioType())
				.append("Footage",getFootage())
				.append("Tab",getTab())
				.append("Title",getTitle())
				.append("Ctitle",getCtitle())
				.append("ImageId",getImageId())
				.append("HomePage",getHomePage())
				.append("CarouselFigure",getCarouselFigure())
				.append("CreateUser",getCreateUser())
				.append("CreateTime",getCreateTime())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof Vedio == false) return false;
			if(this == obj) return true;
			VedioQuery other = (VedioQuery)obj;
			return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
		}
	}

