/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author Stefanie Langhammer
 */
@Entity
public class OrderTotal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="customerId")
    private Customer person;
   
    private String ipAdress;
    private String sessionId;
    private Double totalAll;

  
    public OrderTotal() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getPerson() {
        return person;
    }

    public void setPerson(Customer person) {
        this.person = person;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Double getTotalAll() {
        return totalAll;
    }

    public void setTotalAll(Double totalAll) {
        this.totalAll = totalAll;
    }
 
}
