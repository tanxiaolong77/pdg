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

import com.quanjing.model.platform.VedioInfo;
import com.quanjing.util.framework.BaseQuery;

/**
 * @author xiaolong.tan
 * @version 1.0
 * @since 1.0
 */


public class VedioInfoQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//columns START
		/** id **/
		private java.lang.Long id;
		/** content **/
		private java.lang.String content;
		
		private java.lang.Long userId;
		
		//columns END
		private java.lang.Long vedioId;
		//columns END


		public void setId(java.lang.Long value) {
			this.id = value;
		}
		
		public java.lang.Long getId() {
			return this.id;
		}

		public void setContent(java.lang.String value) {
			this.content = value;
		}
		
		public java.lang.String getContent() {
			return this.content;
		}

		public String toString() {
			return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("Id",getId())
				.append("Content",getContent())
				.toString();
		}
		
		public int hashCode() {
			return new HashCodeBuilder()
				.append(getId())
				.toHashCode();
		}
		
		public boolean equals(Object obj) {
			if(obj instanceof VedioInfo == false) return false;
			if(this == obj) return true;
			VedioInfoQuery other = (VedioInfoQuery)obj;
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

		public java.lang.Long getVedioId() {
			return vedioId;
		}

		public void setVedioId(java.lang.Long vedioId) {
			this.vedioId = vedioId;
		}
		
		
	}

