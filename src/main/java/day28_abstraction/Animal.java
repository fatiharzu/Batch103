package day28_abstraction;

/**
 * <h2>Abstract Class</h2>
 * <lu>
 *  <li>Bir methodu abstarct yapmak icin 1. Method body i sil  2. abstract keyword kullan!!</li>
 *  <li>Andstract method lar abstract class icinde olmalidir</li>
 *
 *  </lu>
 */
public abstract class Animal {
//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
    public abstract void eat();    // Body si olmayan methodlar abstract method olarak adlandirilirlar

    // abstract class larda hem abstract hemde concrete non-abstarct method kullanilabilir
    public void drink() {
        System.out.println("Animals drink...");
    }

    public abstract void move();
//    endregion

}
