package com.company;

import java.util.ArrayList;


public class Car extends  Device{
   public  String model;
   public  String producer;
   public  Double mileage;
   public  Integer yearOfProduction;

   public Car(String model, String producer, Double mileage, Integer yearOfProduction){
       super(model, producer);
       this.model = model;
       this.producer = producer;
       this.mileage = mileage;
       this.yearOfProduction = yearOfProduction;
   }
    public Double value = 1000.0;

    public String toString(){
       return  "Car" + this.model + "" + this.producer;
   }


}
