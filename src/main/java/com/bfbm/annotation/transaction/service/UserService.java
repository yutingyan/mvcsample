package com.bfbm.annotation.transaction.service;

import com.bfbm.annotation.transaction.MyTransactional;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@MyTransactional
	public void add()  {
		System.out.println("11");
	//	int i= 1/0;
		System.out.println("12");
	}

}
