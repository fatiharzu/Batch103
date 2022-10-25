package day22inheritancepolymorphism.animal;

/**
 *          Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.<br>
 *         Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.<br>
 *         O Class'da bulamamzsa Parent Class'lara bakar.<br>
 *         Hicbir Parent Class'da bulamazsa hata verir<br>
 */
public class Runner {
    public static void main(String[] args) {
        Mammal cat2 = new Cat();
        System.out.println(cat2.a);//13

        Animal cat3 = new Cat();
        System.out.println(cat3.a);//12

        /**
         *          Object olustururken Object'in data type'i Child Class'lardan secilemez<br>
         *         inheritance'da variable'lar secilirken Java Constructor'a bakar<br>
         *         oncelikle istediginiz method'u Constructori kullanilan Class'dan alir<br>
         */

//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat

        Mammal cat5 = new Mammal();
        cat5.eat();// Mammal eat

        Animal catt6 = new Animal();
        catt6.eat();//Animal eat
//    endregion
    }
}
