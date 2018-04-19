package com.library.crudapp.repositoryDao;

import com.library.crudapp.domain.Book;
import com.library.crudapp.domain.BookCopy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BookCopyDao extends CrudRepository<BookCopy, Integer> {

    //@Override
    BookCopy save(BookCopy bookCopy);


  //  @Override
     Optional<BookCopy> findByBookCopyId(int id);

     @Override
     void delete(BookCopy bookCopy);


   // @Override
 //  Optional<BookCopy> findByBookId(int bookId);

  // @Override

  int countByBook_Title(String title);

    int countByBookStatus(String status);
}
