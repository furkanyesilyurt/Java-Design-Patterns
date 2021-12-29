package com.furkanyesilyurt.Creational.AbstractFactory;

public class FiestaFactory implements CarFactory{
    @Override
    public Car getCar(String marka, String model, int year, Long price) {

        return new Fiesta(marka, model, year, price);
    }
}
