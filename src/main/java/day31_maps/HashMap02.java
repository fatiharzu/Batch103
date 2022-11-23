package day31_maps;

import java.util.HashMap;

/**
 *
 *          <li>1) Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdığınızda Java memory'de 16 kutu(bucket) içeren bir yapı oluşturur ve
 *          bu yapıdaki her bir kutuya index verir. Index'ler 0'dan 15'e kadardır.</li>
 *          <li>2) Siz "salaries.put("QA", 110000.00);" kodunu yazdığınızda Java key için bir HashCode oluşturur, bu HashCode'u 15'e böler ve kalanı index olarak kullanır.
 *          Ve bu elemanı o index'e yerleştirir.</li>
 *          <li>3) Yerleştirirken 4'lü bir yapı oluşturur, bu yapının ilk bölümüne "HashCode"u ikinci bölümüne "Key"i, üçüncü bölümüne "Value" u ve dördüncü bölümüne
 *          "pointer"ı koyar. Bu çok bölümlü yapı LinkedList'lerdeki Node'dur. Yani HashMap, bucket'lara koyduğu data'yı LinkedList olarak depolar.</li>
 *          <li>4) Java "null" icin hep HashCode olarak "zero" uretir. O yuzden key null oldugunda elaman ilk bucket a yerlestirilir. Bundan dolayi Key si null olan elemalar
 *          Map icinde genellikle ilk sirada gozukurler</li>
 *          <li>5) Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir. Buna "HashCollision" denir.
 *          HashCollision meşhur bir Java development problemidir. Bu problemle karşılaşıldığında developer'lar bu problemi çözmek için kodlar yazarlar, ama bu
 *          Core Java'nın konusu değildir.
 *
 */
public class HashMap02 {

    public static void main(String[] args) {


        HashMap<String, Double> salaries = new HashMap<>();

        salaries.put("QA", 110000.00);

        salaries.put("Developer",1300000.00);

        salaries.put("SalesForce", 1250000.00);

        System.out.println(salaries);

    }
}
