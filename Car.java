package com.company;

public class Car extends  Device{
   public final String model;
   public final String producer;
   public final Double mileage;
   public final Integer yearOfProduction;

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
