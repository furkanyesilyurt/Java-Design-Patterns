package com.furkanyesilyurt.Structural.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Composite implements Component{

    private String name;
    ArrayList<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void getPrice() {
        System.out.println(name);

        for (Component component : components){
            component.getPrice();
        }
    }
}
