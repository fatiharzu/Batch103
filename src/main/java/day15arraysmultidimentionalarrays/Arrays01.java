package day15arraysmultidimentionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binarySearch() Method: Bu method u kullanarak bir elemanin Arrayda olup olmadigini anariz.
//                                binarySearch() method unu kullanmadan once mutlaka "Arrays.sort()," kullanilmalidir.#
//                                binarySearch() method u aradiginiz eleman Array de varsa o elamanin indexini return eder

//                                binarySearch() Methodu aradiginiz eleman Array de yoksa "-a" seklinde bir negaif sayi alirsiniz.
//                                  bu sayidaki "-" isaretinin anlami bu eleman Array de yok demektir.
//                                  "a" nin anlami olsaydi kacinci sirada olurdu demektir
        //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.


        int arr[] = {12,31,43,14} ;

        int sayi = 43;

        Arrays.sort(arr);
        int indx1 = Arrays.binarySearch(arr,sayi);
        System.out.println(indx1);// 3  (index i)

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);

        System.out.println(sonuc);// -5     eger 58 olsadi kacinci sirada olacaksa o lenght ini verir
    }
}
