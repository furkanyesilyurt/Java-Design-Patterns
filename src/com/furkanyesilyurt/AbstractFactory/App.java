package com.furkanyesilyurt.AbstractFactory;

public class App {
    public static void main(String[] args) {

        FiestaFactory fiestaFactory = new FiestaFactory();

        Car fiesta = fiestaFactory.getCar("Ford","Fiesta",2017,200000L);

        MeganeFactory meganeFactory = new MeganeFactory();

        Car megane = meganeFactory.getCar("Renault","Megane",2018,250000L);

        System.out.println(fiesta);
        System.out.println(megane);


    }
}
