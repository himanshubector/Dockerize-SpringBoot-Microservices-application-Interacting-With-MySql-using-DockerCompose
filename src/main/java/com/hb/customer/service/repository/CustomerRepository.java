package com.hb.customer.service.repository;

import com.hb.customer.service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{
    Customer findByCustomerId(Long customerId);

}
