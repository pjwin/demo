package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByCustName(String custName);

    Customer findById(int id);
}
