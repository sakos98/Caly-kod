package com.company;

public abstract class Device {
    public final String model;
    public final String producer;
    public  Double mileage = null;
    public Double yearOfProduction = null;



    protected Device() {
        this.model = model;
        this.producer = producer;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }
}