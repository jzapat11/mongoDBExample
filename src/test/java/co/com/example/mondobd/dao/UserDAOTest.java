package co.com.example.mondobd.dao;
import junit.framework.Assert;

import org.junit.Test;

import co.com.example.mongodb.model.User;


public class UserDAOTest {
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setId("343434343");
		user.setName("Surname Lastname");
		user.setPhone("233432323");
		user.setEmail("anyemail@anyhost.com");
		UserDAO userDAO = new UserDAO();
		boolean inserted;
		inserted = userDAO.insertUser(user);
		Assert.assertEquals(true, inserted);
	}
}
