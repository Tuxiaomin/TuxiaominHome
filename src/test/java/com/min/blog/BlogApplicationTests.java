package com.min.blog;

import com.min.blog.modules.app.entity.User;
import com.min.blog.modules.app.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		User user = userService.getById(1125667541155414017L);
        System.out.println(user.getUsername());

	}

}
