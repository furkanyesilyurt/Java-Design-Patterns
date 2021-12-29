package com.furkanyesilyurt.Creational.Builder;

public class App {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Ford","Fiesta")
                .setEngineCapacity(1250)
                .setTankCapacity(42)
                .setHasFogLight(false)
                .setHasAirConditioner(true)
                .build();

        System.out.println(car.toString());
    }

}
