package org.example.crm_spring.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.crm_spring.entity.Customer;
import org.example.crm_spring.entity.CustomerInfo;
import org.example.crm_spring.repository.CustomerInfoRepository;
import org.example.crm_spring.repository.CustomerRepository;
import org.example.crm_spring.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/showRegister")
    public String showRegisterCustomer(){
        return "customerRegister";
    }

    @PostMapping("/customerRegister")
    @Transactional
    public String loadRegisterCustomer(@ModelAttribute Customer customer, @ModelAttribute CustomerInfo customerInfo){
        customerService.loadCustomerInfo(customer,customerInfo);
        return "redirect:/showRegister";
    }
}
