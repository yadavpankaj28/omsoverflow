package org.oms.app.dal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.oms.app.util.HibernateUtil;



public class LoginHelper {

	private SessionFactory factory = HibernateUtil.getSingleton().getSessionFactory();
	private Session session;
	private Query query;

	public boolean VerifyUser(String uname, String password) {
		boolean isExist = false;

		session = factory.openSession();
		query = session.createQuery("select count(*) from Login where uname=:uname and password=:password");
		query.setParameter("uname", uname);
		query.setParameter("password", password);
		
		int res = query.executeUpdate();
		
		if(res==1)
			isExist=true;
		
		return isExist;
	}

}
