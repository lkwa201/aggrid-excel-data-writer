package redwine.me.aggridexceldatawriter.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redwine.me.aggridexceldatawriter.Entity.Book;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {

	private final BookRepository repository;

	@Transactional
	public void save(List<PostDataRequest> item) {
		List<Book> items = item.stream()
				.map(dataRequest -> PostDataRequest.builder()
						.price(dataRequest.getPrice())
						.name(dataRequest.getName())
						.isbn(dataRequest.getIsbn())
						.author(dataRequest.getAuthor())
						.publisher(dataRequest.getPublisher())
						.build()
						.toEntity())
				.toList();

		repository.saveAll(items);

	}
}
