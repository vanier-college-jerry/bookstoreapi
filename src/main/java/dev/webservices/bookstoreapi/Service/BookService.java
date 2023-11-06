package dev.webservices.bookstoreapi.Service;

import dev.webservices.bookstoreapi.Entity.Books;
import dev.webservices.bookstoreapi.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Iterable<Books> allBooks() {
        return bookRepository.findAll();
    }

    public Optional<Books> singleBook(long id) {
        return bookRepository.findById(id);
    }

    public Books createBook(Books book) {
        return bookRepository.save(book);
    }

    public Books updateBook(Long id, Books updatedBook) {
        if (bookRepository.existsById(id)) {
            updatedBook.setId(id);
            return bookRepository.save(updatedBook);
        }
        return null; // Or throw an exception for resource not found
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
