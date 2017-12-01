/**
  *project GitTest
  *@author changchun.wu
  *2017年12月1日下午4:12:36
  */
package com.wcc.gitTest.base.dao;

import java.util.List;

import com.wcc.gitTest.entity.common.Page;

public interface CrudDao<T> extends BaseDao{
	
	//添加数据
	public int insertEntity(T t);
	
	//批量添加数据
	public int insertBatchEntity(List<T> t);
	
	//更新数据
	public int updateEntity(T t);
	
	//批量更新数据
	public int updateBatchEntity(List<T> t);
	
	//删除数据
	public int deleteEntity(Long id);
	
	//根据id查询数据
	public T findEntityById(Long id);
	
	//查询所有数据
	public List<T> findAllEntity();
	
	//查询页面数据
	public Page<T> findPage(T t);
	
}
