package co.com.example.mondobd.dao;
import junit.framework.Assert;

import org.junit.Test;

import co.com.example.mongodb.model.User;


public class UserDAOTest {
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setId("43190038");
		user.setName("Lina Marcela Parra");
		user.setPhone("3014380925");
		user.setEmail("linita21@gmail.com");
		UserDAO userDAO = new UserDAO();
		boolean inserted;
		inserted = userDAO.insertUser(user);
		Assert.assertEquals(true, inserted);
	}
}
