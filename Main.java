package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        Animal lion = new Animal("lion");
        lion.name = "leo";

        dog.feed();

        Human me = new Human();
        me.firstName = "Michal";
        me.lastName = "Sak";
        me.pet = dog;
        me.pet.feed();
        me.setSalary(1000);


        System.out.println(me.pet.name);


        me.setCar(new Car("Arosa", "Seat", (double) 250000));
        me.getCar();
        System.out.println(me.getCar().producer + " ");
        System.out.println(new Car("Arosa", "Seat",(double)250000));
        System.out.println("I have " + me.getSalary());

        System.out.println("information on the requirements received and signing of the annex to the contract is done");
        System.out.println("information about sending data to the accounting system is ready");
        System.out.println("information on sending updated data to ZUS and Tax Office is included");
    }
}
