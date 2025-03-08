package com.springboot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
