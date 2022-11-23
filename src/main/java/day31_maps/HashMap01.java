    package day31_maps;

    import java.util.Collection;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;

    /**
     * <h2>Map</h2>
     * <lu>
     *  <li>metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.</li>
     *  <li>Maplar key value srtuctor ini kullanirlar.</li>
     *  <li>Map lerde key kismi tekrarsiz data icerir(unique)</li>
     *  <li>value kismi unique olmak zorunda degildir.</li>
     *  <li>key lerde null tekrarsiz kullanilir value tekrarli kullanmak mumkundur.</li>
     *  <li>value kisminda null kullanmak munknudur.</li>
     *  <li>Null bir cok kere kullanilabilir.</li>
     *  <li>coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)</li>
     *  <li>bu iki deger depolamaya entry demisler</li>
     *  <li>mapler hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz</li>
     *  <li>Map lerde key ler unique dir value lerde unique olma zorunlulugu yoktur</li>
     *  <li>Map lerde Key kismi tekrarsiz data icerir</li>
     *  <li>Map lerde Value kismi tekrarli data icerir</li>
     *  <li>Map lerde key kisminda null tekrarsiz kullanilir</li>
     *  <li>Map lerde value kisminda null bircok kerer kullanilabilir</li>
     *  <li>Map in girisi key kismina EntrySet denir</li>
     *  <li>Map lerde key kismi unique oldugu icin olusturdugumuz variable de unique olur</li>
     *  <li>Map lerde suslu parantez kullanilir</li>
     *
     * </lu>
     */

    public class HashMap01 {

    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ali",13);
        stdAges.put("Tom", 21);
        stdAges.put("Brad", 12);
        stdAges.put("Ajda", 76);
        stdAges.put("Cüneyt", 78);

        stdAges.put("Ali", 88);// ayni key degerini tekrar kullandiginizda hata vermez overwrite yapar.
        stdAges.put(null, 55);
        stdAges.put(null, 66);
        stdAges.put("Ayhan Isik", null);
        stdAges.put("Sadri Alisik", null);

        System.out.println(stdAges); //{null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cüneyt=78, Ali=88}

        //Map den sadece key ler nasil alinir.
        Set<String> keys =  stdAges.keySet();

        System.out.println(keys);

        //Map den sadece valueler nasil alinir.
        Collection<Integer> values = stdAges.values();

        System.out.println(values);//[66, null, null, 21, 76, 12, 78, 88]

        //Belli bir key e ait value nasil elde edilir.
        int cunytAge = stdAges.get("Cüneyt");

        System.out.println(cunytAge);

    //    -----------------------------------------------------------------------
        //Example: tüm integer yaslarin ortalamasini hesaplayan kodu yazinir
        Collection<Integer> ages = stdAges.values();
        Integer sum = 0;
        double counter = 0;
        for (Integer w : ages){
            if(w != null){
                sum += w;
                counter++;
            }
        }
        System.out.println("Ortalama yaslar :" + (sum/counter));
    //    --------------------------------------------------------------------
        //Example: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        // keys = [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cüneyt, Ali]

        Set<String> names = stdAges.keySet();

        int sum1 = 0;

        for (String w: names) {

            if(w != null && !w.startsWith("A")){
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1);

        //remove("Ajda", 76); key si Ajda ve value su 76 olan EntrySet i siler ve bize boolean return eder
        boolean result = stdAges.remove("Ajda", 76);
        System.out.println(result);

        Integer result1 = stdAges.remove(null);
        System.out.println(result1);

        // Key varsa bana value versin eger yoksa bana szin istediginiz degeri verir.

        Integer getDeger = stdAges.getOrDefault("Brad", 0);

        System.out.println(getDeger); // 12

        Integer getDeger2 = stdAges.getOrDefault("Brendon", 0);

        System.out.println(getDeger2); // 0

        // Key yoksa Map a ekle, key varsa map a herhangi bir ekleme yapmaz
        //Value null ise ekleme yapar, value null degilse ekleme yapar

        Integer result3 = stdAges.getOrDefault("Ayhan Isik", 100);

        System.out.println(result3);

        Integer result4 = stdAges.putIfAbsent("Brad", 100);
        System.out.println(stdAges);
        System.out.println(result4);

        //key yoksa ekleme yapar
        Integer result5 = stdAges.putIfAbsent("Acun", 200);
        System.out.println(stdAges);
        System.out.println(result4);

        //replace(); method u degistirmek icin kullanilir

        stdAges.replace("Acun", 49);
        System.out.println(stdAges);//{Ayhan Isik=null, Sadri Alisik=null, Tom=21, Acun=49, Brad=12, Cüneyt=78, Ali=88}

        stdAges.replace("Acun", 49, 53);// degistirdi cunku value dogru -- {Ayhan Isik=null, Sadri Alisik=null, Tom=21, Acun=53, Brad=12, Cüneyt=78, Ali=88}
        System.out.println(stdAges);
        stdAges.replace("Acun", 55, 42);// degistirmedi cunku value yanlis {Ayhan Isik=null, Sadri Alisik=null, Tom=21, Acun=53, Brad=12, Cüneyt=78, Ali=88}
        System.out.println(stdAges);
        System.out.println("----------------------------------------------------------------------------------");
//        -----------------------------------------------------------------------
        //Example : Map deki herbir Entry i ekrana farkli bir satirda olacak sekilde yazdiriniz

        Set< Map.Entry <String, Integer>> entries = stdAges.entrySet();
        for (Map.Entry<String, Integer> w : entries){
            System.out.println(w);
        }




    }


    }
