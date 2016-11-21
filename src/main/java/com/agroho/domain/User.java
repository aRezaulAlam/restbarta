package com.agroho.domain;
/**
 * Author: Rezaul - Date: 21-Nov-16.
 */
import com.agroho.domain.pogo.Address;
import com.agroho.domain.pogo.AutismCenter;

import javax.persistence.*;
import java.util.List;


@Entity
public class User extends BaseEntity {

    private String name;
    private String email;
    private String password;
    private String role;
    private String phoneNumber;
    @Embedded
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




}