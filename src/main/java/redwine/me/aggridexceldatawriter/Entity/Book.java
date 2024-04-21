package redwine.me.aggridexceldatawriter.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@NoArgsConstructor
@Entity
public class Book {

	@Id @GeneratedValue
	@Column(name = "book_id")
	private Long id;

	@Comment("도서명")
	private String name; //도서명

	@Comment("출판사")
	private String publisher; //출판사

	@Comment("저자")
	private String author; //저자

	@Comment("가격")
	private String price; //가격

	@Comment("ISBN(책의 고유번호)")
	@Column(updatable = false, unique = true)
	private String isbn; //ISBN(책의 고유번호)

	@Builder
	public Book(String name, String publisher, String author, String price, String isbn) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
}
