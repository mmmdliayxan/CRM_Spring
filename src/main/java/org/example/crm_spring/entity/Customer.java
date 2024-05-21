package org.example.crm_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @OneToOne(mappedBy = "customer")
    @PrimaryKeyJoinColumn
    CustomerInfo customerInfo;
}
