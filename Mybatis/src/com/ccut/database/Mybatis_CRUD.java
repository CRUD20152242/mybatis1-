package com.ccut.database;

import java.util.List;

import com.ccut.DAO.T;
/**
 * 这是基于代理的开发模式，其中遵循以下4点原则
 *  mapper接口的全限定名要和mapper映射文件的namespace的值相同。
 *	mapper接口的方法名称要和mapper映射文件中的statement的id相同。
 *	mapper接口的方法参数只能有一个，且类型要和mapper映射文件中statement的parameterType的值保持一致。
 *  mapper接口的返回值类型要和mapper映射文件中statement的resultType值或resultMap中的type值保持一致。
 * @author admin
 *
 */

public interface Mybatis_CRUD {
	
	public void deleteTByID(int id);
	public void updateTByID(T t);
	public void insertTByID(T t);
	public List<T> selectTByID(String name);

}
