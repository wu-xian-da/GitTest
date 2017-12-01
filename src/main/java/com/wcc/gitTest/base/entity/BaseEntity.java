/**
  *project GitTest
  *@author changchun.wu
  *2017年12月1日下午4:08:14
  */
package com.wcc.gitTest.base.entity;

import java.io.Serializable;

/**
 * 基类
 * @author changchun.wu
 */
public class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5998592304327525408L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
