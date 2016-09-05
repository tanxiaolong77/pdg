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
	
	
	
	public void update(E entity) throws DataAccessException{
		getEntityDao().update(entity);
	}
	
	public static String formatLongToTimeStr(Long l) {
		// String str = "";
		int hour = 0;
		int minute = 0;
		int second = 0;
		if (l != null) {
			second = l.intValue();

			if (second > 60) {
				minute = second / 60;
				second = second % 60;
			}
			if (minute > 60) {
				hour = minute / 60;
				minute = minute % 60;

			}
		}
		String ret ="";
		if(hour>0){
			ret = int2String(hour) + ":" + int2String(minute) + ":" + int2String(second);
		}else{
			if(minute>0){
				ret = int2String(minute) + ":" + int2String(second);
			}else{
				ret = "00:"+int2String(second);
			}
		}
		return ret;

	}
	
	public static String int2String(int time){
		return time > 9?time+"":"0"+time;
	}
	
}
