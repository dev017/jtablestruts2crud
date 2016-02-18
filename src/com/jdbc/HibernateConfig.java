package com.jdbc;

import org.hibernate.cfg.Configuration;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateConfig {

	private static SessionFactory sessionFactory;
	static{
		try{
			Configuration config = new Configuration();
			config = config.configure("config/Hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			//sesstionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("Succeful connection with database in hc.java");
		}catch(Throwable ex){
			System.out.println("Not able to create connection with database, Inside HibernateConfig.java");
			ex.printStackTrace();
		}
	}
	
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session != null){
			session.close();
		}
	}
		
}
