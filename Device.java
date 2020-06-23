package com.company;

import javax.naming.CompoundName;

public abstract class Device {
    public final String model;
    public final String producer;
    public  Double mileage = null;
    public Double yearOfProduction = null;
    protected Human owner;
    protected CompoundName setOfApplications;
    protected Application[] myApps;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
}
