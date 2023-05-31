package com.recipes.app;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.recipes.app.controllers.UserController;

@SpringBootTest
class RecipesApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	public void contextLoads() throws Exception {
		assertNotEquals(null, userController, "User contrller is not inintialized");
	}

}
