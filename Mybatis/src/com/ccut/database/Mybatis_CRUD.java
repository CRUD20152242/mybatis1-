package com.ccut.database;

import java.util.List;

import com.ccut.DAO.T;
/**
 * ���ǻ��ڴ���Ŀ���ģʽ��������ѭ����4��ԭ��
 *  mapper�ӿڵ�ȫ�޶���Ҫ��mapperӳ���ļ���namespace��ֵ��ͬ��
 *	mapper�ӿڵķ�������Ҫ��mapperӳ���ļ��е�statement��id��ͬ��
 *	mapper�ӿڵķ�������ֻ����һ����������Ҫ��mapperӳ���ļ���statement��parameterType��ֵ����һ�¡�
 *  mapper�ӿڵķ���ֵ����Ҫ��mapperӳ���ļ���statement��resultTypeֵ��resultMap�е�typeֵ����һ�¡�
 * @author admin
 *
 */

public interface Mybatis_CRUD {
	
	public void deleteTByID(int id);
	public void updateTByID(T t);
	public void insertTByID(T t);
	public List<T> selectTByID(String name);

}
