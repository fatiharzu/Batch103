package day13loopsarrays;

import java.util.Arrays;

/**
 * <h2>Arrays</h2>
 * <lu>
 *     <li>Ayni data tipinde, coklu data'i depolamak icin Java'nin olusturdugu yapilar vardir.<br>
 *     Bu yapilardan biri de "Array" lerdir</li>
 *     <li>Icine yerlestirdigimiz Datalarin Data Type'i hep ayni olmalidir</li>
 * </lu>
 */


public class Arrays01 {
    public static void main(String[] args) {
//          Array nasil yazdirilir?
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
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

//        Example 01: Array deki en kucuk ve en buyuk elemani yazdiriniz

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];

        //Note: lenght(); Stringlerde kullanilir, lenght Arraylerde kullanilir

        int son = stdAges[stdAges.length-1];

        // Example 02: stdAges Array i icindeki tüm elemanlari toplamini yazdiralim
//      1. Yol loop ile yapma
        int sum = 0;

        for (int i =0 ; i<stdAges.length ; i++) {

            sum = sum + stdAges[i];
        }
        System.out.println("for loop :"+sum);



//      2. Yol while loop ile yapma
        int i =0;
        int toplam = 0;

        while ( i< stdAges.length) {
            toplam = toplam +stdAges[i];

        i++;
        }
        System.out.println("\nwhile loop :"+toplam);


//      3. Yol do while loop ile yapma
        int k = 0;
        int s = 0;

//        do {
//            s = s + stdAges[k];
//        }while (k<stdAges.length);
        System.out.println("\ndo while loop :"+s);

//      4. Yol Foreach loop ile yapma
//         Arraylerde vs Collections lardakullanilir

        int t = 0;

        for (int w : stdAges ) {
            t = t + w;
        }
        System.out.println("\nforeach loop :"+ t );

//           Example 3: String bir array olusturunuz
//           Bu Array'e 5 tane isim yerlestiriniz
//           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz

        String isimler[] = new String[5];

        isimler[0]="Ali";
        isimler[1]="Tom";
        isimler[2]="Veli";
        isimler[3]="Kemal";
        isimler[4]="Cem";

        int karakterSayilariToplami = 0;
        for (String w : isimler ) {
            karakterSayilariToplami =karakterSayilariToplami + w.length();
        }

        System.out.println("\nIsimler Array indeki karakter sayilarinin toplami : "+karakterSayilariToplami+"\n");


//    Example 4 : Char bir array olusturunuz
//    Bu array e 5 eleman ekleyiniz
//    Bu array deki sadece büyük harfleri ekrana yazdiriniz

    char ch[]= {'A','c','D','k','A','h','M'};

    for(char w : ch){

        if (w>='A' && w<='Z') {
            System.out.print(w);
        }
    }



    }
}
