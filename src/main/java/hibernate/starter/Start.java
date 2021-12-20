package hibernate.starter;

import java.time.LocalDate;
import java.util.List;

import hibernate.dao.AdditionUser;
import hibernate.dao.GettingUser;
import hibernate.domain.User;


public class Start {
	
	public static void main(String[] args) {
		List<User> users;

		User user = new User();
		user.setFirstName("Yakov111");
		user.setLastName("Tyutterin");
		user.setMiddleName("Nikolaevich");
		user.setDateOfBirth(LocalDate.of(2001, 06, 8));
		
		AdditionUser add = new AdditionUser();
		GettingUser getUs = new GettingUser();
		System.out.println(add.addUser(user));
		user = getUs.getUser(3L);
		System.out.println(user);
		
		users = getUs.getUsers(1, 15);
		System.out.println("\n*******************************\n");
		users.forEach(u->System.out.println(u));
		System.out.println("\n*******************************\n");
		users = getUs.getUsers();
		users.forEach(us->System.out.println(us));
	}
	
	
	
}
