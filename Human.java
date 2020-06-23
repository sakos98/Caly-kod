package com.company;

public class Human {

    private final double weight;
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    Double cash;
    private double salary;
    public Car[] garage;
    public final FarmAnimal[] farm;
    private static final Integer DEFAULT_FARM_SIZE = 6;
    private static final Integer DEFAULT_GARAGE_SIZE = 4;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(int rise) {
        if (rise < 0) {
            System.out.println("I am so poor! :(");
        } else {
            System.out.println("Rise: ");
            this.salary = rise;
        }
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car){
        if (salary>car.value){
            System.out.println("Wow, you can bay car for cash");
            this.car = car;
        } else if (salary * 12 < car.value){
            System.out.println("So close man to buy a car");
            this.car = car;
        } else {
            System.out.println("Sorry this car is not for you");
        }
    }

    public void setsalary(int salary){
        if (salary > 0){
            System.out.println("It's okey");
        } else {
            System.out.println("impossible");
        }
    }

    public Human() {
        this.weight = 80.0;
        this.farm = new FarmAnimal[DEFAULT_FARM_SIZE];
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize, Integer farmSize) {

        this.weight = 80.0;
        this.farm = new FarmAnimal[farmSize];
        this.garage = new Car[garageSize];
    }

    public Human(FarmAnimal[] farm, Integer garageSize) {
        this.farm = farm;
        this.weight = 80.0;
        this.garage = new Car[garageSize];
    }

    public void sumValue() {
        double value = 0;
        }
}

