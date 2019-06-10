package com.example.service.user;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.user.UserModel;
import com.example.service.user.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Spy
	private UserServiceImpl spy;
	private UserModel userModel = new UserModel("chinna", "gatlachinna87@gmail.com", 1L);

	@Test
	@Ignore
	public void testGetUserById() {
		doReturn(userModel).when(spy).getUserById(1l);
		assertNotNull(userModel.getName());

	}

	@Test
	public void testGetUserByEmail() {
		assertNull(spy.getUserByEmail("gatlachinna87@gmail.com"));
	}
}
