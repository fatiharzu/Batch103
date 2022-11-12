package day23inheritancepolymorphism;

public class Animal{
//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
    public void eat(){
        System.out.println("Animanls eat");
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multiply(int a,int b){
        return a*b;
    }

    //Asagidaki method Overridden Method => Overreide edilecek
    public Animal create(){
        return new Animal();
    }

    public final double divide(int a,int b){
        return a/b;
    }
//    endregion

}
