package day22inheritancepolymorphism.vehicle;

/**
 * <lu>
 * <li>
 * 1) Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir,<br>
 * cunku Java Class in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak<br>
 * icin constructor in sart oldugunu bilir.
 * </li>
 * <li>
 * 2) Java nin otomatik olarak olusturdugu bu gorunmez constructor a "default constructor" denir.
 * </li>
 * <li>
 * 3) Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor" i siler.
 * </li>
 * <li>
 * 4) Bir Class'da birden fazla Constructor olabilir. Fakat bu constructor'ların parametreleri farklı olmalıdır.
 * </li>
 * <li>
 * 5) "this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'daki "price" isimli variable demektir.<br>
 *       "this.price" syntax'i constructor'ların içinde kullanılır.
 * </li>
 * <li>
 * 6) Constructor kullanarak variable lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.<br>
 *  Class daki variable degerlerini degistiremez...
 * </li>
 * </lu>
 */
public class HondaAccord extends Honda {
    //    region Konstanten
    //    endregion

    //    region Attribute
    public int price;
    public int year;
    public String make;
    public String model;
    //    endregion

    //    regionKonstruktor
    public HondaAccord() {

    }

    public HondaAccord(int price) {
        this.price = price;
    }

    public HondaAccord(int price, int year) {
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make=make;
        this.model=model;

    }
    //    endregion

    //    regionMethoden
    //    endregion

}
