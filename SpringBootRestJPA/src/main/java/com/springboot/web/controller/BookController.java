package com.springboot.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Entity.Book;
import com.springboot.web.services.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	//1 Get all books
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return this.bookService.getAllBooks();
	}
	//get book by id 
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{return this.bookService.getBookById(id);
		
	}
	//add a book
@PostMapping("/books")
public Book addBook(@RequestBody Book book)
{
	return this.bookService.addBook(book);
}
//delete book by id 

@DeleteMapping("/books/{id}")
public void deleteBook(@PathVariable("id") int id)
{ this.bookService.deleteBookById(id);
	
}
//update a book by id
@PutMapping("/books/{id}")
public Book addBook(@PathVariable("id") int id,@RequestBody Book book)
{
return this.bookService.updateBook(id,book);
}
}
