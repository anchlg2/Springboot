package com.springboot.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.web.Entity.Book;
import com.springboot.web.dao.BookRepository;

@Component
public class BookService {
	@Autowired
	private BookRepository bRepo;
	public List<Book> getAllBooks()
	{
		List<Book> books=(List<Book>) this.bRepo.findAll();
		return books;
	}
	
	public Book getBookById(int id)
	{
		 Book book=this.bRepo.findById(id); // this one is custom method and not default method of CRUD
		return book;
	}
public Book addBook(Book book)
{
	Book book1=this.bRepo.save(book);
	return book1;
}
public void deleteBookById(int id)
{
	 this.bRepo.deleteById(id);
	
}
public Book updateBook(int id,Book book)
{
	Book book1=this.bRepo.save(book);
	return book1;
}
}
