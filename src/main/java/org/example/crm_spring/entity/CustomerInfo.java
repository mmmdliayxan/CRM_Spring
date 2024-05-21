package org.example.crm_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.crm_spring.enums.Gender;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String maritalStatus;
    private String educationDegree;
    private String university;
    private String speciality;
    private String jobStatus;
    private String job;
    private String courseProgram;
    private String knowledge;
    @Column(name = "suitable_hours")
    private String hours;


}
