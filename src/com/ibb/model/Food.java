/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibb.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

/**
 *
 * @author Stefanie Langhammer
 */
@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS )
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodNo;
    private String name;
    private String ingredients;
    private Double price;
    
//    @ManyToMany(targetEntity=OrderedFood.class)
//    private Set orderedFoodlist;
    
    public Food(Integer foodNo, String name, String ingredients, Double price) {
        this.foodNo = foodNo;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public Food(String name) {
        this.name = name;
    }

    public Food() {

    }

    public Integer getFoodNo() {
        return foodNo;
    }

    public void setFoodNo(Integer foodNo) {
        this.foodNo = foodNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
