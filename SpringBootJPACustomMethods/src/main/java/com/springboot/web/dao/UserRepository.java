package com.springboot.web.dao;

import java.util.List;

import org.hibernate.type.TrueFalseConverter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	// custom methods
	public List<User>  findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	public List<User>  findByStatus(String status);
	public List<User>  findByNameStartingWith(String prefix);
	public List<User>  findByNameEndingWith(String suffix);
	//using @Query (JPQL-java persitant query language)
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	@Query("select u from User u where u.name= :n " )
	public List<User> getUserByName(@Param("n") String name);
	@Query("select u from User u where u.name= :n and u.city= :c" )
	public List<User> getUserByNameAndCity(@Param("n") String name , @Param("c" ) String city);
	//using normal SQL 
	@Query(value = "select * from User" ,nativeQuery = true)
	public List<User> getUsers();
}
