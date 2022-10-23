package day13loopsarrays;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        int stdAges[] = new int[7];

        System.out.println(Arrays.toString(stdAges));//[0, 0, 0, 0, 0, 0, 0]

//          Array e eleman nasil eklenir?
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        int t = 0;

        for (int w : stdAges ) {
            t = t + w;
        }
        System.out.println("\nforeach loop :"+ t );

        for (int integer : stdAges){
            System.out.println(integer);
        }
    }

}
