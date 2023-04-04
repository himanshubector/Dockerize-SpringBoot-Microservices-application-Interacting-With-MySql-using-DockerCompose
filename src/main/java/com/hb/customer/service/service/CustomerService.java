package com.hb.customer.service.service;

import com.hb.customer.service.entity.Customer;
import com.hb.customer.service.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Customer saveCustomer(Customer customer)
    {
        log.info("Inside saveUser method of CustomerService");
        return customerRepository.save(customer);
    }


}

