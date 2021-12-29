package com.furkanyesilyurt.Creational.AbstractFactory;

public class MeganeFactory implements CarFactory{
    @Override
    public Car getCar(String marka, String model, int year, Long price) {

        return new Megane(marka, model, year, price);
    }
}
