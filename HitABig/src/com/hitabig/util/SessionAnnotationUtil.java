package com.hitabig.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class SessionAnnotationUtil {
	public static final SessionFactory sessionFactory;
	
	static {
		try{		
	 sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		}catch (Throwable e) {
		 throw new ExceptionInInitializerError(e);
		}
	}
	
	public static final ThreadLocal<Session> session =new ThreadLocal<Session>();

	public static Session getSession(){
		Session s=session.get();
		if(s==null){
			s=sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}
	
	public static void closeSession(){
		Session s=session.get();
		if(s!=null){
			s.close();
		}
		session.set(null);
	}
	
}
