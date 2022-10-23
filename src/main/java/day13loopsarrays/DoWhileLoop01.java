package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucukse ekrana "Kazandin!" yazdiriniz.
        //Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //Kullanici kazandikca oyun devam etmeli.

        Scanner scan = new Scanner(System.in);
            int sayi =0;
//        do {
//            System.out.println("Lütfen bir sayi giriniz");
//            sayi = scan.nextInt();
//            if (sayi<100){
//                System.out.println("Kazanidiniz!");
//            }
//        }while (sayi<100);
//
//            System.err.println("Kaybettiniz!");

            //Example 2: Kullanicidan isim aliniz ilk harfinin buyuk olup olmadigini kontrol ediniz



        do {
            System.out.println("Lütfen isminizi giriniz!!");
            char isim = scan.next().charAt(0);
            if (isim>='A' && isim <='Z') {
                System.out.println("ismi basariyla girdiniz");
            }else {
                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }
        }while (true);


        //Infinite Loop: Sonsuz dongu
    }
}
