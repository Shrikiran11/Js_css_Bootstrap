package com.example.demo1;

import java.time.LocalDate;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@AllArgsConstructor
@Setter
@Getter
@Entity
@Component
public class Registration {
private String userName;
private String password;
private String role;
private String firstName;
private String lastName;
private String email;
private String phoneNo;
private String address1;
private String address2;
private String city;
private String state;
private int pincode;
private LocalDate dob;
}
