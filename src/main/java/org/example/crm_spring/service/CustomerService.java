package org.example.crm_spring.service;

import org.example.crm_spring.entity.Customer;
import org.example.crm_spring.entity.CustomerInfo;

public interface CustomerService {
    CustomerInfo loadCustomerInfo(Customer customer, CustomerInfo customerInfo);

}
