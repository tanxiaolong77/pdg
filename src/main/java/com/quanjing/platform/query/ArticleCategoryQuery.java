package com.quanjing.platform.query;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.quanjing.util.framework.BaseQuery;


public class ArticleCategoryQuery extends BaseQuery implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 4313400428968498836L;
	/** id */
	private java.lang.Long id;
	/** name */
	private java.lang.String name;
	/** orders */
	private java.lang.Integer orders;

	public java.lang.Long getId() {
		return this.id;
	}
	
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.Integer getOrders() {
		return this.orders;
	}
	
	public void setOrders(java.lang.Integer value) {
		this.orders = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

