package dev.webservices.bookstoreapi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.webservices.bookstoreapi.Entity.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Long> {

}
