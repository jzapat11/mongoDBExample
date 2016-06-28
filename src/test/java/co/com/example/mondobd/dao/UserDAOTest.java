package co.com.example.mondobd.dao;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import co.com.example.mongodb.model.User;


public class UserDAOTest {
	
	private User user;
	
	@Before
	public void setUpUser(){
		user = new User();
		user.setId("8127886");
		user.setName("Juan Zapata");
		user.setPhone("3014667304");
		user.setEmail("jzapat11@gmail.com");
	}
	
	@Test
	public void test() {
		UserDAO userDAO = new UserDAO();
		boolean inserted;
		inserted = userDAO.insertUser(user);
		Assert.assertEquals(true, inserted);
	}
}
