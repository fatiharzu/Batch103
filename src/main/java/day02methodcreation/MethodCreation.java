package day02methodcreation;

public class MethodCreation {

    // main method icinde kullanacaginiz hersey static olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));

        System.out.println(ucSayiyiCarp(2, 1.5,6));

        System.out.println(ilkIkiSayiyitoplaUcuncuSayiyiCarp(2,3,4));


        System.out.println(cikarma(5,3));

        bolme(10,2);
        

    }

    private static double bolme(double i, double i1) {

        return i/i1;
    }

    //  Example 1 : Toplama islemi yapan bir mthod olusturun
    public static double toplamaYap(double a, double b){

        return a+b;
    }
//  Example 2 : Uc sayiyi carpan method olusturun
    public static double ucSayiyiCarp(double a, double b, double c){

        return a*b*c;
    }
    //Example 3: Us sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup, sonucu ekrana yazdirirniz

    public static double ilkIkiSayiyitoplaUcuncuSayiyiCarp(double a, double b, double c){

        return (a+b)*c;
    }


    public static double cikarma(double a, double b){

       return a-b;
    }


    public static void cikarmaYazdirma(){
        System.out.println("cikarma");
    }






















}
