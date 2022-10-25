package day22inheritancepolymorphism.animal;

import day22inheritancepolymorphism.animal.Mammal;

public class Cat extends Mammal {
//    region Konstanten
//    endregion

    //    region Attribute
    public int a = 14;


//    endregion

//    regionKonstruktor
    public Cat(){
        System.out.println("Cat");
    }
//    endregion

    //    regionMethoden
    public void eat() {
        System.out.println("Cat eat");
    }
//    endregion

}
