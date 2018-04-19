package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface BookDao extends CrudRepository<Book, Integer> {
    @Override
    Book save(Book book);

    Optional<Book> findByBookId(int id);

    @Override
    void delete(Book book);

}
