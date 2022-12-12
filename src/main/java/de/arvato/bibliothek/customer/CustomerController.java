package de.arvato.bibliothek.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customer")
    List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @PostMapping("/customer")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    @GetMapping("/customer/{id}")
    Customer one(@PathVariable Long id) throws Exception {
        return customerRepository.findById(id)
                .orElseThrow(() -> new Exception("unable to found customer"));
    }

    @DeleteMapping("/customer/{id}")
    void deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
    }
}

    


