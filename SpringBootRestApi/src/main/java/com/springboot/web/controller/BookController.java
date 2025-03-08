package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Entity.Book;
import com.springboot.web.services.BookService;

//@Controller
@RestController
public class BookController {
	//method 1
//	@RequestMapping(value="/books" ,method = RequestMethod.GET )  //equivalent to @GetMapping
//	@ResponseBody
//public String getBooks()
//{
//	return "this is testing book first responsebody+controller+requestmappping";
//}
	//method 2
//	@GetMapping("/books")
//	@ResponseBody
//public String getBooks()
//{
//	return "this is getmapping first getmapping+controller+responsebody";
//}
//	//method 3
//	@GetMapping("/books")
//	public String getBooks()
//	{
//		return "getmapping+restcontroller";
//	}
	// 4 to get a book
//	@GetMapping("/books")
//	public Book getBook()
//	{
//		Book book=new Book();
//		book.setId(1);
//		book.setTitle("Java");
//		book.setAuthor("Anchal");
//		return book;
//	}
	
	//to get all books
	@Autowired
	private BookService bookService;
	@GetMapping("/books")
	public List<Book> getBooks()
	{return this.bookService.getAllBooks();
		
	}
	//get book by id
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int bookId)
	{
		return this.bookService.getBook(bookId);
	}
	//add book
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book)
	{
	Book book2=	this.bookService.addBook(book);
	return book2;
	}
	//delete book by Id
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id)
	{
		this.bookService.deleteBook(id);
	}
	// update book by id
	@PutMapping("/books/{id}")
	public Book updateBook(@PathVariable("id" ) int id , @RequestBody Book book)
	{
		return this.bookService.updateBook(id, book);
	}
}
