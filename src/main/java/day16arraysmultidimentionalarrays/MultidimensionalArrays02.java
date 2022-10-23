package day16arraysmultidimentionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

//        Multidimensional Array kisa yoldan nasil olusturulur?
        char arr[][] = {{'a','b'},{'C','D','E'},{'?'}};

        System.out.println(Arrays.deepToString(arr));//

//        Bir String multidimensional Array'de icinde "a" olan elemanlari console'a yazdiriniz

        String brr[][] ={{"learn", "java", "it"},{"is", "easy"}}; //[[a, b], [C, D, E], [?]]

        for (String[] w : brr){
            for (String k: w){
                if (k.contains("a")){
                    System.out.print(k + " ");//learn java easy
                }
            }
        }
    }
}
