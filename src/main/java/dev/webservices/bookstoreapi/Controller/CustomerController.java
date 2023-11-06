package dev.webservices.bookstoreapi.Controller;

import dev.webservices.bookstoreapi.Entity.Books;
import dev.webservices.bookstoreapi.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.webservices.bookstoreapi.Entity.Customer;
import dev.webservices.bookstoreapi.Service.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer() {

        return new ResponseEntity<List<Customer>>((List<Customer>) customerService.allCustomer(), HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Optional<Customer>> getSingleCustomer(@PathVariable long id) {

        return new ResponseEntity<Optional<Customer>>(customerService.singleCustomer(id), HttpStatus.OK);
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.createCustomer(customer), HttpStatus.OK);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.updateCustomer(id, customer), HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Message> deleteCustomer(@PathVariable long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<Message>(new Message("Successfully Deleted"), HttpStatus.OK);
    }

}
