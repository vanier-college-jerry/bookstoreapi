package dev.webservices.bookstoreapi.Service;

import java.util.Optional;

import dev.webservices.bookstoreapi.Entity.Books;
import dev.webservices.bookstoreapi.Entity.Customer;
import dev.webservices.bookstoreapi.Repository.BookRepository;
import dev.webservices.bookstoreapi.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Iterable<Customer> allCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> singleCustomer(long id) {
        return customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer updateCustomer) {
        if (customerRepository.existsById(id)) {
            updateCustomer.setId(id);
            return customerRepository.save(updateCustomer);
        }
        return null; // Or throw an exception for resource not found
    }

    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }


}
