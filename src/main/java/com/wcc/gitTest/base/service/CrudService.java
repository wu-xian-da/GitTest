/**
  *project GitTest
  *@author changchun.wu
  *2017年12月1日下午4:23:53
  */
package com.wcc.gitTest.base.service;

import java.util.List;

import com.wcc.gitTest.base.dao.CrudDao;
import com.wcc.gitTest.base.entity.BaseEntity;
import com.wcc.gitTest.entity.common.Page;

public abstract class CrudService<T extends BaseEntity,Dao extends CrudDao<T>> extends BaseService{
	
	private Dao dao;

	//添加数据
	public int insertEntity(T t){
		return this.dao.insertEntity(t);
	}
	
	//批量添加数据
	public int insertBatchEntity(List<T> t){
		return this.dao.insertBatchEntity(t);
	}
	
	//更新数据
	public int updateEntity(T t){
		return this.dao.updateEntity(t);
	}
	
	//批量更新数据
	public int updateBatchEntity(List<T> t){
		return this.dao.updateBatchEntity(t);
	}
	
	//删除数据
	public int deleteEntity(Long id){
		return this.dao.deleteEntity(id);
	}
	
	//根据id查询数据
	public T findEntityById(Long id){
		return this.dao.findEntityById(id);
	}
	
	//查询所有数据
	public List<T> findAllEntity(){
		return this.dao.findAllEntity();
	}
	
	//查询页面数据
	public Page<T> findPage(T t){
		return this.dao.findPage(t);
	}
		
}
