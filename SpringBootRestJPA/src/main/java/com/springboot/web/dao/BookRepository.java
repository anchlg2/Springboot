package com.springboot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.Entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {
public Book findById(int id); // this custom method is created because default findById method return optional<Book> value
}
