package org.example.crm_spring.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.crm_spring.entity.Customer;
import org.example.crm_spring.entity.CustomerInfo;
import org.example.crm_spring.enums.Gender;
import org.example.crm_spring.repository.CustomerInfoRepository;
import org.example.crm_spring.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerInfoRepository customerInfoRepository;
    @Override
    public CustomerInfo loadCustomerInfo(Customer customer, CustomerInfo customerInfo) {
        if (customerInfo.getGender() != null) {
            customerInfo.setGender(Gender.valueOf(String.valueOf(customerInfo.getGender())));
        }
         customerInfo.setCustomer(customer);
         return customerInfoRepository.save(customerInfo);
    }
}
