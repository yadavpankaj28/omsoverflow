package org.oms.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final HibernateUtil single;
	private SessionFactory factory;
	static {
		single=new HibernateUtil();
	}
	
	private HibernateUtil()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
		factory = cfg.buildSessionFactory();
	}
	
	public static HibernateUtil getSingleton()
	{
		return single;
	}
	
	public SessionFactory getSessionFactory()
	{
		return factory;
	}

	
	@Override
	protected void finalize() throws Throwable {
		factory.close();
	}
}
