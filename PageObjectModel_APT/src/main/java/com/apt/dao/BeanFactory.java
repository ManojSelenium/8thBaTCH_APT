package com.apt.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	
	
	public void createUserData(CreateUserBean bean) {
		bean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		bean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		bean.setLastName(RandomStringUtils.randomAlphabetic(5));
	}
	
	
	public void editUserData(EditUserBean bean) {
		bean.setFirstName(RandomStringUtils.randomAlphabetic(5));
	}
	
	
}
