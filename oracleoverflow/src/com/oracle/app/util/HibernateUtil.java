package com.oracle.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final HibernateUtil single;

	static {
		single = new HibernateUtil();
	}

	private SessionFactory factory;

	private HibernateUtil() {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static HibernateUtil getSingleton() {
		return single;
	}

	public SessionFactory getSessionFactory() {
		return factory;
	}

	@Override
	protected void finalize() throws Throwable {
		factory.close();
	}

}
