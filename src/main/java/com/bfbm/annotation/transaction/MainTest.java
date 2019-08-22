package com.bfbm.annotation.transaction;

import com.bfbm.annotation.transaction.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(TxConfig.class);
		UserService userService = context.getBean(UserService.class);
		userService.add();
	}


}
