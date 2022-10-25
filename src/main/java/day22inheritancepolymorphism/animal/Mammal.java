package day22inheritancepolymorphism.animal;

public class Mammal extends Animal {
//    region Konstanten
//    endregion

//    region Attribute
    public int a = 13;
    public int b = 34;
//    endregion

//    regionKonstruktor
    public Mammal(){
        System.out.println("Mammal");
    }
//    endregion

//    regionMethoden
    public void drink(){
        System.out.println("Mammal Drink");
    }
//    endregion

}
