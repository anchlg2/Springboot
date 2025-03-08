package com.springboot.web;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entity.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SpringBootJpaApplication.class, args); // this is spring IOC container
		
		UserRepository uRep=context.getBean(UserRepository.class);
		// 1 add user
		User user=new User();
		user.setName("Tanya");
		user.setCity("Jaipur");
		user.setStatus("Women");
		uRep.save(user);
		System.out.println(user);
		User user1=new User();
		user1.setName("Manya");
		user1.setCity("Raipur");
		user1.setStatus("Men");
		User reUser=uRep.save(user1);
		System.out.println(reUser);
		//2 to add multiple users
//		User user2=new User();
//		user2.setName("Anchal");
//		user2.setCity("Agra");
//		user2.setStatus("Good");
//		
//		User user3=new User();
//		user3.setName("Ayush");
//		user3.setCity("Delhi");
//		user3.setStatus("Bad");
//		List<User>list=List.of(user2,user3); //list.of feature from java 9
//	Iterable<User> iterable=	uRep.saveAll(list); //in CrudRepository , it return only iterable type list
//	System.out.println(iterable);
	//3 update the user with given id
//	Optional<User> user=uRep.findById(2);
//		User user4=user.get();
//		user4.setName("Neha");
//		uRep.save(user4);
//		
		
		// 4 to get the data
//	Iterable<User>users=uRep.findAll();
////	System.out.println(users);
//	users.forEach(e-> System.out.println(e));
	
	//to get the user by id
//	Optional<User> user=uRep.findById(25);
//	System.out.println(user.orElseThrow());  //if not present then exception
	
	//5 delete a user by id
//	uRep.deleteById(52);
		//or below method
//	Optional<User>user=	uRep.findById(53);
//	User user2=user.get();
//	uRep.delete(user2);
		//6 to delete all users
//		uRep.deleteAll();
	}

}
