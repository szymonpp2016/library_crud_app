package com.library.crudapp.library;

import com.library.crudapp.domain.Book;
import com.library.crudapp.domain.BookCopy;
import com.library.crudapp.repositoryDao.BookCopyDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationBookCopyTests {

    private static final String STATUS_RENTED="RENTED";
    private static final String  STATUS_AVAILABLE="AVAILABLE";
    public static final String STATUS_DAMAGED = "DAMAGED";
    public static final String STATUS_LOST = "LOST";

    @Autowired
    private BookCopyDao bookCopyDao;

    @Test
    public void testBookCopyAdd() {

        //Given
        Book book1 =  new Book("aaaaa","aaaaa",2017);
        BookCopy bookCopy = new BookCopy(book1,"rented");

        //When
        bookCopyDao.save(bookCopy);

        //Then
        int id = bookCopy.getBookCopyId();
        Optional<BookCopy> readBookCopy = bookCopyDao.findByBookCopyId(id);
       assertEquals(id, readBookCopy.get().getBookCopyId());

        //CleanUp
        bookCopyDao.delete(bookCopy);
    }

    @Test
    public void testCountBookCopyDao() {

        //Given
        Book book1 =  new Book("aaaaa","aaaaa",2017);
        Book book2 =  new Book("aaaaa","aaaaa",2017);

        BookCopy copy1 = new BookCopy(book1,STATUS_AVAILABLE);
        BookCopy copy2 = new BookCopy(book2,STATUS_RENTED);

        //When
        bookCopyDao.save(copy1);
        bookCopyDao.save(copy2);

        //Then
        int copiesCount = bookCopyDao.countByBook_Title(book1.getTitle());
        assertEquals(2, copiesCount);

        //clean up
        bookCopyDao.delete(copy1);
        bookCopyDao.delete(copy2);
    }

    @Test
    public void testCountBookCopyAvailableTorent() {

        //Given
        Book book1 =  new Book("aaaaa","aaaaa",2017);
        Book book2 =  new Book("aaaaa","aaaaa",2017);

        BookCopy copy1 = new BookCopy(book1,STATUS_AVAILABLE);
        BookCopy copy2 = new BookCopy(book2,STATUS_RENTED);

        //When
        bookCopyDao.save(copy1);
        bookCopyDao.save(copy2);

        //Then
        int copiesCount = bookCopyDao.countByBookStatus(STATUS_AVAILABLE);
        assertEquals(1, copiesCount);

        //clean up
        bookCopyDao.delete(copy1);
        bookCopyDao.delete(copy2);
    }
}
