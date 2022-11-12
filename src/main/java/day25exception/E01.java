        package day25exception;

        /**
         * Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.<br>
         * 1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method<br>
         *  isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.<br>
         * 2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir<br>
         *  try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda<br>
         *  Javanin ne yapmasini istedigimizi yazabiliriz<br>
         *  ---------------------------------------------------------------------------------------------<br>
         *        1)"Exception" (istisnai hata) Java'da kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır<br>
         *        2)Exception'lar ile çalışmanın iki yolu vardır<br>
         *               a)try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme.<br>
         *               b)throw exception kullanarak çalışmayı durdurma (mesela yazdığımız kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise<br>
         *                                                                bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)<br>
         *        3) Eğer exception'ı handle etmez isek (sorunu halletmezsek) java çalışmayı durdurur.<br>
         *        4) try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullana biliriz.<br>
         *        5) try catch olmaksızın yanlız kullanılamaz<br>
         *        6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz  try-catch block iciene koymalisiniz<br>
         *        7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir<br>
         *        8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.<br>
         *          System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir<br>
         *          e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder<br>
         *          System.err.println(); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz<br>
         *       9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez <br>
         */
        public class E01 {


        //    region Konstanten
        //    endregion

        //    region Attribute
        //    endregion

        //    regionKonstruktor
        //    endregion

        //    regionMethoden
        public static void main(String[] args) {
        //    divide(2,3);
        //    divide(0,5);
        //    divide(6,0);
            divide2(5,0);
        }

        public static void divide(int a, int b){
            if (b == 0) {
                System.out.println("Bir sayi sifir ile bolunemez");
            }else {
            System.out.println(a/b);
            }
        }

        public static void divide2(int a, int b){
            try {
                System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println("Bölme isleminde problem olustu"+e.getMessage());
                e.printStackTrace();
                System.err.println("Bölme isleminde bir hata olustu");
            }

        }
        //    endregion
        //
    }
