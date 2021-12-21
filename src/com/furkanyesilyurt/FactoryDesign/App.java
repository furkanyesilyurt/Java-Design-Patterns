package com.furkanyesilyurt.FactoryDesign;

public class App {

    public static void main(String[] args) {

        Car fiesta = CarCreator.getCar("Ford", "Fiesta", 2017,200000L);

        Car megane = CarCreator.getCar("Renault", "Megane", 2018,250000L);

        System.out.println("Fiesta arabanın özellikleri");
        System.out.println(fiesta);
        System.out.println("Megane arabanın özellikleri");
        System.out.println(megane);

    }

}
