package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.user.UserModel;
import com.example.respository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Mock
	private UserRepository userService;
	@Mock
	private UserModel userModel;

	@Before
	public void setup() {

	}

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

	@Test
	public void userNameTest() {
		when(userModel.getName()).thenReturn("Srinivasareddy");
		assertEquals(userModel.getName(), "Srinivasareddy");
	}
}
