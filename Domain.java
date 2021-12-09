package domain;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import bl.HibernateUtil;
import entity.Address;
import entity.Employee;
import entity.Project;

public class Domain {

	public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	session.beginTransaction();
	
	
	Address add = new Address();
	add.setCountry("Russia");
	add.setCity("St.Petersburg");
	add.setStreet("Dybenko");
	add.setPostCode("3233223");
	
	Employee emp = new Employee();
	emp.setFirstName("Sasha");
	emp.setLastName("Krotov");
	Calendar cl = Calendar.getInstance();
	cl.set(2000, Calendar.MARCH, 23);
	emp.setBirthday(new Date(cl.getTime().getTime()));
	emp.setAddress(add);
	
	Project pr = new Project();
	pr.setTitle("43443");
	
	Set<Project> prs = new HashSet<Project>();
	prs.add(pr);
	emp.setProjects(prs);
	
	session.save(add);
	session.save(emp);
	session.save(pr);
	
	session.getTransaction().commit();
	HibernateUtil.shutdown();
	
	
	}
}
