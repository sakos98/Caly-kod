package com.company;

public class Human {

    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;


    private double salary;



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
        if (salary<car.value){
            System.out.println("Wow, you can bay car for cash");
        } else if (salary * 12 < car.value){
            System.out.println("So close man to buy a car");
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
}

