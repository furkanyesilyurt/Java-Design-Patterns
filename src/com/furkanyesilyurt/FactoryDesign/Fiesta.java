package com.furkanyesilyurt.FactoryDesign;

public class Fiesta implements Car{

    private String marka;
    private String model;
    private int year;
    private Long price;

    public Fiesta(String marka, String model, int year, Long price) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Fiesta{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
