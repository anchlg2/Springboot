package com.springboot.web.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springboot.web.Entity.Book;
@Component
public class BookService {
	private static List<Book> books=new ArrayList<>();
	
	static {
books.add(new Book(1,"Java","Anchal"));
books.add(new Book(2,"Python","Ayush"));
books.add(new Book(3,"Spring","Luke"));
books.add(new Book(4,"JDBC","Riya"));
	}
	public List<Book> getAllBooks()
	{
		return books;
	}
public Book getBook(int id)
{
	Book book2=books.stream().filter(e-> e.getId()==id).findFirst().get();
	return book2;
}
public Book addBook(Book book)
{
	books.add(book);
	return book;
}
public void deleteBook(int id)
{
	Book book=books.stream().filter(b->b.getId()==id).findFirst().get();
	books.remove(book);
	

}
public Book updateBook(int id,Book book)
{
books=	books.stream().map(e->
	{
		if(e.getId()==id)
		{
			e.setTitle(book.getTitle());
			e.setAuthor(book.getAuthor());
		}
		return e;  //return each book
		
	}).collect(Collectors.toList());
return book;
}
}
