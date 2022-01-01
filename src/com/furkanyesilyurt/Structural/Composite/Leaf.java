package com.furkanyesilyurt.Structural.Composite;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;

public class Leaf implements Component{

    private Long price;
    private String name;

    public Leaf(Long price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getPrice() {
        System.out.println(name + " : " + price);
    }
}
