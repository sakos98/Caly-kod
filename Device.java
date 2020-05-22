package com.company;

public abstract class Device {
    public final String model;
    public final String producer;
    public  Double mileage = null;
    public Double yearOfProduction = null;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
}
