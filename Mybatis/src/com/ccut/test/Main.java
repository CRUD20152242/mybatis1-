package com.ccut.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.ccut.DAO.T;
import com.ccut.database.CRUD;
import com.ccut.database.Mybatis_CRUD;
import com.ccut.mybatisUtil.MybatisUtil;

public class Main {
		private static void sqlByinterface(){
			SqlSession session = MybatisUtil.getSession(true);
			Mybatis_CRUD mapper = session.getMapper(Mybatis_CRUD.class);
			//mapper.deleteTByID(1);
			T t =  new T();
//			t.setId(1);
//			t.setName("xyda");
//			mapper.insertTByID(t);
//			t.setId(1);
//			t.setName("xyd");
//			mapper.updateTByID(t);
			List<T> a = mapper.selectTByID("xyd");		
			for(T v:a){
				System.out.println(v.getId()+"-----"+v.getName());
			}
			
			session.close();
		}
		
		private static void sqlByxml(){
			CRUD crud = new CRUD();
			T t = new T();
			t.setId(3);
			t.setName("123xuyandong");
			//crud.insertTByID(t);
			crud.updateTByID(t);
			List<T> a = crud.selectTByID("123xuyandong");
			for(T as:a){
				System.out.println(as.getId()+"   "+as.getName());
			}
			crud.deleteTByID(3);
			List<T> b = crud.selectTByID("123xuyandong");
			for(T as:b){
				System.out.println(as.getId()+"   "+as.getName());
			}
		}
		public static void main(String[] args) {
			//sqlByinterface();
			sqlByxml();
		}
}
