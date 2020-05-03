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

        me.car = new Car("Arosa",
                "Seat",
                (double) 250000);
        me.setCar(new Car("Arosa", "Seat", (double) 250000));
        System.out.println(me.car.producer + " ");
        System.out.println("I have " + me.getSalary());
    }
}
