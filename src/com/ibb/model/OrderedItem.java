/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Stefanie Langhammer
 */
@Entity
public class OrderedItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderedItemId;
       
    private Integer number;
    private Double totalLine;
    
    @OneToOne(targetEntity = Food.class)
    @JoinColumn(name="foodNo")
    private Food food;
    
    @ManyToOne(targetEntity = OrderTotal.class)
    @JoinColumn(name="orderId")
    private OrderedItem orderedItem;        
    

    public OrderedItem(Integer foodNo, String name, String ingrediants, Double price) {
        food=new Food(foodNo, name, ingrediants, price);
        this.number = 0;

    }

    public OrderedItem(String name, Integer number) {
        food=new Food(name);
        this.number = number;
    }

    public OrderedItem() {
   
    }

    public OrderedItem(Food f, Integer n) {
        food=new Food(f.getFoodNo(),f.getName(), f.getIngredients(), f.getPrice());
//        setFoodNo(f.getFoodNo());
//        setPrice(f.getPrice());
//        setName(f.getName());
//        setIngredients(f.getIngredients());
        this.number = n;
    }

    public OrderedItem(Food f) {
        food=new Food(f.getFoodNo(),f.getName(), f.getIngredients(), f.getPrice());
//        setFoodNo(f.getFoodNo());
//        setPrice(f.getPrice());
//        setName(f.getName());
//        setIngredients(f.getIngredients());
        this.number = 0;
    }

    public Double getTotalLine() {

        return this.number * food.getPrice();
    }

    public void setTotalLine(Double totalLine) {
        this.totalLine = totalLine;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
}
