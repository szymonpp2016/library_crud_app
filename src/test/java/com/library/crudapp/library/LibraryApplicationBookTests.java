package com.library.crudapp.library;

import com.library.crudapp.domain.Book;
import com.library.crudapp.repositoryDao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationBookTests {


    @Autowired
    private BookDao bookDao;

    @Test
    public void testBookAdd() {
        //Given
        Book book = new Book("aaaaa","aaaaa",2017);

        //When
        bookDao.save(book);

        //Then
        int id = book.getBookId();
        Optional<Book> readBook = bookDao.findByBookId(id);
        assertEquals(id, readBook.get().getBookId() );

        //CleanUp
        bookDao.delete(book);
    }

}
