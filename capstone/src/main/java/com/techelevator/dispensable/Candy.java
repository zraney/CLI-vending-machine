package com.techelevator.dispensable;

import java.math.BigDecimal;

public class Candy implements Dispensable {

    public final String CANDY_MESSAGE = "Munch Munch, Yum!";

    private String name;
    private BigDecimal price;
    private int quantity = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int dispense() {
        quantity--;
        return quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}