package com.furkanyesilyurt.Creational.AbstractFactory;

public interface CarFactory {

    Car getCar(String marka, String model, int year, Long price);
}
