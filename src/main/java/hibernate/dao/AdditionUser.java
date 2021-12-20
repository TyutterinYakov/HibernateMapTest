package hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernate.domain.User;
import hibernate.util.BuildSessionFactory;

public class AdditionUser {

	public Long addUser(User user) {
		Long id=-1L;
		BuildSessionFactory dao = new BuildSessionFactory();
		SessionFactory factory = dao.getSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		try {
			session.persist(user);
			tr.commit();
			session.close();
			id = user.getUserId();
			session.close();
			
		
		} catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return id;
	}
	
	

}
