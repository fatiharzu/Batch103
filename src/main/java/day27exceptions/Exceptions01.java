     package day27exceptions;

     /**
      * Interview sorusu : "final", "finally", "finalize" nedir?<br/>
      * final(keyword): ==> final method override edilemez.<br/>
      *               final variable degeri degistirilemez.<br/>
      *               final class child class sahibi olamaz.<br/>
      * finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.<br/>
      *
      * finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.<br/>
      */

        public class Exceptions01 {
        //    region Konstanten
        //    endregion

        //    region Attribute
        //    endregion

        //    regionKonstruktor
        //    endregion

        //    regionMethoden
        public static void main(String[] args) {

           double r1 =compareNonOfCharacters("Java", "xy");
            System.out.println(r1);
            double r2 =compareNonOfCharacters(null, "xy");
            System.out.println(r2);
            double r3 =compareNonOfCharacters("Selenium", "");
            System.out.println(r3);


        }
        // Verilen iki String den birinin karakter sayisinin digerinin kac kati oldugunu veren method olusturunuz

        public static double compareNonOfCharacters(String s, String t){

            double result = 0;
            try {
                result = s.length() / t.length();
            }
            catch (NullPointerException e){
                System.out.println("length() methodu numm ile kullanilamaz");
            }
            catch (ArithmeticException e){
                System.out.println("Herhangi bir sayi sifir ile bolunemez");
            }finally {
                System.out.println("Database ile connection kesildi");
            }
                return result;
        }
/**
 *  "final", "finally", "finalize!"
 *
 *  - "final" bir keyword dur  variable class ve methodlarda kullanilir...
 *
 *  - "finally" bir 'code block' dur
 *              try-catch  ceya sadece try ile kullanilir
 *     "finally" code block icinde yailan code lar her halukarda calisitirilir
 *     Mesela Database ile connection kesmek her halukarda yapilmasi gereken bir fiildir. Bunu "finally" yapabiliriz.
 *
 *  -"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
 *       imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.
 *
 */
        //    endregion
     }
