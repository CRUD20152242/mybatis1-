package com.ccut.mybatisUtil;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static Reader reader;
	private static SqlSessionFactory factory;
	private static String cfg = "Configuration.xml";
	private static void setSqlSessionFactory(){
		try {
			//读取配置文件
			reader = Resources.getResourceAsReader(cfg);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("找不到文件！");
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(boolean yes){
		setSqlSessionFactory();
		return factory.openSession(yes);
	}
}
