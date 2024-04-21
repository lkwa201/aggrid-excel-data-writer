package redwine.me.aggridexceldatawriter.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import redwine.me.aggridexceldatawriter.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
