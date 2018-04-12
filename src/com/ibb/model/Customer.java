/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author Stefanie Langhammer
 */
@Entity

public class Customer extends User implements Serializable {
  
    private String firstname;
    private String lastname;
    private String street;
    private String houseNo;
    private String postcode;
    private String town;
    private String phone;

    public Customer(String firstname, String lastname, String street, String houseNo, String postcode, String town, String phone, String email) {
        super(email);
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.houseNo = houseNo;
        this.postcode = postcode;
        this.town = town;
        this.phone = phone;
    }
    
    public Customer(String lastname, String street, String houseNo, String postcode, String town, String phone, String email) {
        super(email);
        this.lastname = lastname;
        this.street = street;
        this.houseNo = houseNo;
        this.postcode = postcode;
        this.town = town;
        this.phone = phone;
    }
    
    public Customer() {
    }
    
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
 
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
   
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
  
    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    
   
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
 
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    
   
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(StringBuilder result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
