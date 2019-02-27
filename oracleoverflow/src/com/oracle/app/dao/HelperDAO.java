package com.oracle.app.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.oracle.app.util.HibernateUtil;

public class HelperDAO {

	private SessionFactory factory = HibernateUtil.getSingleton().getSessionFactory();
	private Transaction tran;
	private Session session;
	private Query query;
	private boolean check;

	public boolean validate(String name, String password) {

		try {
			session = factory.openSession();
			query = session.createQuery("select count(*) from UserDTO where name=:name and password=:password");
			query.setParameter("name", name);
			query.setParameter("password", password);

			 Long n = (Long) query.uniqueResult();
			if (n == 1)
				check = true;
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return check;
	}
}
