/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.quanjing.platform.query;

import com.quanjing.util.framework.BaseQuery;

public class ArticleQuery extends BaseQuery implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	private java.lang.Long id;
	
	/** categoryId */
	private java.lang.Long categoryId;
	
	/** creatTime */
	private java.util.Date creatTimeBegin;
	private java.util.Date creatTimeEnd;

	public java.lang.Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(java.lang.Long categoryId) {
		this.categoryId = categoryId;
	}

	public java.util.Date getCreatTimeBegin() {
		return creatTimeBegin;
	}

	public void setCreatTimeBegin(java.util.Date creatTimeBegin) {
		this.creatTimeBegin = creatTimeBegin;
	}

	public java.util.Date getCreatTimeEnd() {
		return creatTimeEnd;
	}

	public void setCreatTimeEnd(java.util.Date creatTimeEnd) {
		this.creatTimeEnd = creatTimeEnd;
	}

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}
}
