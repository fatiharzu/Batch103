    package day27exceptions;

    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;

    /**
     * <lu>
     *     <li>FileInputStream fis   = new FileInputStream();</li>
     *     <p>
     *         "new" den sonra ki  "FileInputStream"  hata verir. Cünkü biz Java ya verilen adrestreki dosyaya git dedik,<br/>
     *         Java iki endiseye kapildi 1.) Ya adres yanlissa 2.) Ya verilen adreste dosya yoksa.
     *         Biz "Method isminden" sonra, "throws FileNotFoundException" yazarak, Java ya bu iki endiseye duydugun durum<br/>
     *         olusursa "Exception At" dedik.
     *     </p>
     *     <li>while((k = fis.read()) != -1) {} yazdigimizda </li>
     *     <p>
     *         "read()" methodu hata verir. Cünkü biz Java ya dosyada ki karakterleri oku dedik. Java bir endiseye kapildi<br>
     *         1.) Y okumasi gereken karakterler Javanin bilmedigi karakterlerse . Biz method isminden sonra "throws IOException"<br>
     *         yazarak Java ya bu durumla karsilaastiginda "Exception At" dedik.
     *     </p>
     *     <li>Method isminden sonra "throws IOException" yazarsaniz Java "throws FileNotFoundException" i siler</li>
     *
     *     <p>Cünkü "IOException", "FileNotFoundException" i kapsar. "IOException", "FileNotFoundException" in parentidir<br>
     *     onun yaptigi herseyi o yuzden "IOException" varken  "FileNotFoundException" a gerek yoktur. <br>
     *
     *         "IOException" "Input Output  Exception" demektir.
     *     </p>
     *     <li>Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.</li><br>
     *     <p>
     *         Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.
     *
     *            "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
     *     </p>
     * </lu>
     */

    public class Exceptions02 {
            //    region Konstanten
            //    endregion

            //    region Attribute
            //    endregion

            //    regionKonstruktor
            //    endregion

            //    regionMethoden

        // Bir text file daki texti okuyan bir code yaziniz
            public static void main(String[] args) throws IOException {

                    readTheTextFromTheFile();

                    readTheText();
            }

//              1.Way;
            public static void readTheTextFromTheFile() throws IOException {
                    FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File.txt");
                    int k = 0;

                    while ((k= fis.read())  != -1)  {
                        System.out.print((char)k);
                    }
            }
//              2.Way
            public static void readTheText(){

                try {
                    FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File.");

                    int k = 0;

                    while ((k= fis.read())  != -1)  {
                        System.out.print((char)k);
                    }

                } catch (IOException e) {

                    System.out.println("Dosyanin adresi veya varlligi ile ilgili bir problem var.");

                }
            }

    }


