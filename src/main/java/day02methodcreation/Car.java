package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {
//                      Object nasil olusturulur?

        // 1 Class ismini yazariz      2 Objeye bir isim veririniz          3  =            4 new keyword unu kullan          5 Class ismi parantezle beraber
             Car                             myHonda                           =                     new                                      Car();



        Car myCar = new Car();
        myCar.fiyat= 500000;
        myCar.marka= "Honda";

        System.out.println(myCar.fiyat+" "+myCar.marka);
        myCar.hareketEt();
        myCar.dur();

        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
    }




    public void hareketEt(){
        System.out.println("Honda guzel hareket eder....");
    }

    public void dur(){
        System.out.println("Honda gvenli durur...");
    }


}
