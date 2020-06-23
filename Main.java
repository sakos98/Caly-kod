package com.company;

import java.util.Arrays;

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
        me.setSalary(10000);

        me.farm[0] = new FarmAnimal("pig", 120.0, 5);
        me.farm[1] = new FarmAnimal("cat", 5.0, 1);
        me.farm[2] = new FarmAnimal("donkey", 100.0, 4);
        me.farm[3] = new FarmAnimal("bee", 300.0, 100);
        me.farm[4] = new FarmAnimal("Dog", 500.0, 1);
        me.farm[5] = new FarmAnimal("sheep", 120.0, 5);
        Arrays.sort(me.farm);
        System.out.println(Arrays.toString(me.farm));

        me.garage[0] = new Car("GTR", "Nissan", 5.000, 2019);
        me.garage[1] = new Car("Aventador","lamborghini", 4.000, 2018);
        me.garage[2] = new Car("Veyron", "Bugatti", 1.000, 2018);
        me.garage[2] = new Car("720S", "MCLAREN", 3.000, 2020);
        Arrays.sort(me.garage);
        System.out.println(Arrays.toString(me.garage));
        System.out.println();
        System.out.println();

        System.out.println(me.pet.name);


        me.setCar(new Car("Arosa", "Seat", (double) 250000, 1998));
        me.getCar();
        System.out.println(me.getCar().producer + " ");
        System.out.println(new Car("Arosa", "Seat",(double)250000, 1998));
        System.out.println("I have " + me.getSalary());

        System.out.println("information on the requirements received and signing of the annex to the contract is done");
        System.out.println("information about sending data to the accounting system is ready");
        System.out.println("information on sending updated data to ZUS and Tax Office is included");

    }
}
