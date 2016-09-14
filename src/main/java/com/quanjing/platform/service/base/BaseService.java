package com.quanjing.platform.service.base;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author 
 */
@Transactional
public abstract class BaseService <E,PK extends Serializable>{
	
	protected abstract EntityDao getEntityDao();
	
	@Transactional(readOnly=true)
	public E getById(PK id) throws DataAccessException{
		return (E)getEntityDao().getById(id);
	}	
	
	/** 插入数据 */
	public E save(E entity) {
		 getEntityDao().insert(entity);
		 return entity;
	}
	
	public void removeById(PK id) throws DataAccessException {
		getEntityDao().delete(id);
	}
	
	public void update(E entity) throws DataAccessException{
		getEntityDao().update(entity);
	}
	
	
	
}
