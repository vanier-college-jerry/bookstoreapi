package dev.webservices.bookstoreapi.Controller;

import dev.webservices.bookstoreapi.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.webservices.bookstoreapi.Entity.Books;
import dev.webservices.bookstoreapi.Service.BookService;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<List<Books>> getAllBooks() {

        return new ResponseEntity<List<Books>>((List<Books>) bookService.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Optional<Books>> getSingleBook(@PathVariable long id) {

        return new ResponseEntity<Optional<Books>>(bookService.singleBook(id), HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<Books> createBook(@RequestBody Books book) {
        return new ResponseEntity<Books>(bookService.createBook(book), HttpStatus.OK);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<Books> updateBook(@PathVariable long id, @RequestBody Books book) {
        return new ResponseEntity<Books>(bookService.updateBook(id, book), HttpStatus.OK);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<Message> deleteBook(@PathVariable long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<Message>(new Message("Successfully Deleted"), HttpStatus.OK);
    }
}
