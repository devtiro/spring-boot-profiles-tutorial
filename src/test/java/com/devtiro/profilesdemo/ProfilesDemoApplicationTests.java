package com.devtiro.profilesdemo;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.devtiro.profilesdemo.services.Greeter;

@SpringBootTest
class ProfilesDemoApplicationTests {

	@MockBean
	private Greeter greeter;

	@Test
	void contextLoads() {
	}

}
