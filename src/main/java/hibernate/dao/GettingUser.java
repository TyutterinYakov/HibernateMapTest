package hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.domain.User;
import hibernate.util.BuildSessionFactory;

public class GettingUser {
	private List<User> users;
	
	public User getUser(Long id) {
		BuildSessionFactory factory = new BuildSessionFactory();
		Session session = factory.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		User user = session.get(User.class, id);
		tr.commit();
		session.close();
		return user;
	}
	
	public List<User> getUsers(){
		BuildSessionFactory factory = new BuildSessionFactory();
		Session session = factory.getSessionFactory().openSession();
		
		users = session.createCriteria(User.class).list();
		session.close();
		return users;
	}
	
	public List<User> getUsers(int start, int end){
		BuildSessionFactory factory = new BuildSessionFactory();
		Session session = factory.getSessionFactory().openSession();
		users = session.createCriteria(User.class).setMaxResults(end).setFirstResult(start).list();
		
		session.close();
		
		return users;
	}
	

}
