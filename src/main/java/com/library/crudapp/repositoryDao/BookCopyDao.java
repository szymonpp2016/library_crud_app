package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.BookCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface BookCopyDao extends CrudRepository<BookCopy, Integer> {

    BookCopy save(BookCopy bookCopy);

    Optional<BookCopy> findByBookCopyId(int id);

    @Override
    void delete(BookCopy bookCopy);

    int countByBook_Title(String title);

    int countByBookStatus(String status);
}
