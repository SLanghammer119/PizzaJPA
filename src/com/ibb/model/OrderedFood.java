package com.ibb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Stefanie Langhammer
 */
@Entity
public class OrderedFood extends Food implements Serializable {
    @Id
    private Integer number;
    private Double totalLine;

    public OrderedFood(Integer foodNo, String name, String ingrediants, Double price) {
        super(foodNo, name, ingrediants, price);
        this.number = 0;

    }

    public OrderedFood(String name, Integer number) {
        super(name);
        this.number = number;
    }

    public OrderedFood() {
        super();

    }

    public OrderedFood(Food f, Integer n) {
        setFoodNo(f.getFoodNo());
        setPrice(f.getPrice());
        setName(f.getName());
        setIngredients(f.getIngredients());
        this.number = n;
    }

    public OrderedFood(Food f) {
        setFoodNo(f.getFoodNo());
        setPrice(f.getPrice());
        setName(f.getName());
        setIngredients(f.getIngredients());
        this.number = 0;
    }

    public Double getTotalLine() {

        return this.number * getPrice();
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
