package dev.webservices.bookstoreapi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.webservices.bookstoreapi.Entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
