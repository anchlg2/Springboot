package com.springboot.web;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entity.User;

@SpringBootApplication
public class SpringBootJpaCustomMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJpaCustomMethodsApplication.class, args);
		UserRepository uRep=context.getBean(UserRepository.class);
	List<User> users=	uRep.findByName("Tanya");
	System.out.println(users);
	List<User> users2=uRep.findByNameAndCity("Manya", "Raipur");
	System.out.println(users2);
	List<User> users3=uRep.findByStatus("Bad");
	System.out.println(users3);
	List<User> users4=uRep.getAllUsers();
	System.out.println(users4);
	List<User> users5=uRep.getUserByName("Anchal");
	System.out.println(users5);
List<User> users6=uRep.getUsers();
System.out.println(users6);
List<User> users7=uRep.getUserByNameAndCity("Anchal","Agra");
System.out.println(users7);
	
	}

}
