package com.ccut.database;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ccut.DAO.T;
import com.ccut.mybatisUtil.MybatisUtil;

/**
 * mybatis  入门即使用规则之增删改查
 * @author admin
 *
 */
public class CRUD implements Mybatis_CRUD{

	//删除
	@Override
	public void deleteTByID(int id) {
		String arg0 = "com.ccut.database.Mybatis_CRUD.deleteTByID";
		SqlSession session = MybatisUtil.getSession(true);	
		session.delete(arg0, id);
		session.close();	
	}
	//修改
	@Override
	public void updateTByID(T t) {
		String arg0 = "com.ccut.database.Mybatis_CRUD.updateTByID";
		SqlSession session = MybatisUtil.getSession(true);
		session.update(arg0, t);
		session.close();
		
	}
	//插入
	@Override
	public void insertTByID(T t) {
		String arg0 = "com.ccut.database.Mybatis_CRUD.insertTByID";
		SqlSession session = MybatisUtil.getSession(true);
		session.insert(arg0, t);
		session.close();
		
	}
	//查询
	@Override
	public List<T> selectTByID(String name) {
		String arg0 = "com.ccut.database.Mybatis_CRUD.selectTByID";
		SqlSession session = MybatisUtil.getSession(true);
		List<T> result = session.selectList(arg0, name);
		session.close();
		return result;
	}
}
