package com.company;

public class Application {
    public final String appName;
    public double version;
    public double price;

    public Application(String name, double version, double price) {
        this.appName = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return appName;
    }

    public double getVersion() {
        return version;
    }

    public double getPrice() {
        return price;
    }

}
