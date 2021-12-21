package com.furkanyesilyurt.FactoryDesign;

public class CarCreator {

    public static Car getCar(String marka, String model, int year, Long price){

        Car car;
        if("Fiesta".equalsIgnoreCase(model)){
            car = new Fiesta(marka, model, year, price);
        } else if("Megane".equalsIgnoreCase(model)){
            car = new Megane(marka, model, year, price);
        } else {
            throw new RuntimeException("Gecersiz bir araba üretilmeye calisildi");
        }

        return car;
    }

}
