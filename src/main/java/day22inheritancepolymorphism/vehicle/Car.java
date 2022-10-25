package day22inheritancepolymorphism.vehicle;

import day22inheritancepolymorphism.vehicle.Vehicle;

public class Car extends Vehicle {
//    region Konstanten
//    endregion

//    region Attribute
    public String colour;
    int km;
//    endregion

//    regionKonstruktor
    public Car(){

    }

    public Car(String colour, int km){
        super("Car");
        this.colour=colour;
        this.km=km;
        System.out.println("Car Constructor");
    }
//    endregion

//    regionMethoden
//    endregion

}
