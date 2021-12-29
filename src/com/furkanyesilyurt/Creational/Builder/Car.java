package com.furkanyesilyurt.Creational.Builder;

public class Car {

    private String brand;
    private String model;

    private int productionYear;
    private int seatNumber;
    private int tankCapacity;
    private int engineCapacity;

    private boolean hasTurbo;
    private boolean hasFogLight;
    private boolean hasAirConditioner;

    public Car(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.productionYear = carBuilder.productionYear;
        this.seatNumber = carBuilder.seatNumber;
        this.tankCapacity = carBuilder.tankCapacity;
        this.engineCapacity = carBuilder.engineCapacity;
        this.hasTurbo = carBuilder.hasTurbo;
        this.hasFogLight = carBuilder.hasFogLight;
        this.hasAirConditioner = carBuilder.hasAirConditioner;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public boolean isHasTurbo() {
        return hasTurbo;
    }

    public boolean isHasFogLight() {
        return hasFogLight;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", seatNumber=" + seatNumber +
                ", tankCapacity=" + tankCapacity +
                ", engineCapacity=" + engineCapacity +
                ", hasTurbo=" + hasTurbo +
                ", hasFogLight=" + hasFogLight +
                ", hasAirConditioner=" + hasAirConditioner +
                '}';
    }

    public static class CarBuilder{

        private String brand;
        private String model;

        private int productionYear;
        private int seatNumber;
        private int tankCapacity;
        private int engineCapacity;

        private boolean hasTurbo;
        private boolean hasFogLight;
        private boolean hasAirConditioner;

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        public CarBuilder setSeatNumber(int seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public CarBuilder setTankCapacity(int tankCapacity) {
            this.tankCapacity = tankCapacity;
            return this;
        }

        public CarBuilder setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder setHasTurbo(boolean hasTurbo) {
            this.hasTurbo = hasTurbo;
            return this;
        }

        public CarBuilder setHasFogLight(boolean hasFogLight) {
            this.hasFogLight = hasFogLight;
            return this;
        }

        public CarBuilder setHasAirConditioner(boolean hasAirConditioner) {
            this.hasAirConditioner = hasAirConditioner;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

}
