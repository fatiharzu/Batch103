package day22inheritancepolymorphism.vehicle;

import day22inheritancepolymorphism.vehicle.Vehicle;

public class Honda extends Car {
//    region Konstanten
//    endregion

//    region Attribute
    public String colour;
//    endregion

//    regionKonstruktor
    public Honda(){
        super("White",54000);

    }

    public Honda(String colour){
        this.colour =colour;
        System.out.println("Honda Constructor");
    }
//    endregion

//    regionMethoden
//    endregion

}
