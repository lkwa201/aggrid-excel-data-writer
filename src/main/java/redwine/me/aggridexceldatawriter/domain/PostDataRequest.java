package redwine.me.aggridexceldatawriter.domain;


import lombok.*;
import redwine.me.aggridexceldatawriter.Entity.Book;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class PostDataRequest {

	private List<Book> books;

	public String name;
	public String publisher;
	public String author;
	public String price;
	public String isbn;

	@Builder
	public PostDataRequest(String name, String publisher, String author, String price, String isbn) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	public Book toEntity() {
		return Book.builder()
				.name(name)
				.publisher(publisher)
				.author(author)
				.price(price)
				.isbn(isbn)
				.build();
	}



}