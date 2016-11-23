package com.agroho.domain;

import com.agroho.domain.pogo.Address;

import javax.persistence.*;
import java.util.List;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Entity
public class Parent extends BaseEntity {

    private String name;

    @Embedded
    private Address address;

    private String email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "parent")
    private List<Child> children;

    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
        @ManyToOne
        @JoinColumn(name = "autism_center_id")
        private AutismCenter autismCenter;*/
public String getName() {
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }/*

    public AutismCenter getAutismCenter() {
        return autismCenter;
    }

    public void setAutismCenter(AutismCenter autismCenter) {
        this.autismCenter = autismCenter;
    }*/
}
