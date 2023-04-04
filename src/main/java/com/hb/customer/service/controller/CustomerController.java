package com.hb.customer.service.controller;

import com.hb.customer.service.entity.Customer;
import com.hb.customer.service.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        log.info("Inside saveUser method of UserController");
        return customerService.saveCustomer(customer);
    }




//    @GetMapping("/{id}")
//    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId)
//    {
//        log.info("Inside getUserWithDepartment method of UserController");
//        return userService.getUserWithDepartment(userId);
//    }

}
