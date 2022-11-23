package day32maps;

import java.util.Hashtable;

/**
 *              1)HashTable bir map'dir.<br>
 *             2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.<br>
 *             3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.<br>
 *             4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.<br>
 *             5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.<br>
 *
 *             Note: toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.<br>
 *                   toString() method'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.<br>
 */
public class HasTable01 {

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulation = new Hashtable<>();

        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Turkey", 90000000);
        System.out.println(countryPopulation);

//        countryPopulation.put(null, 9000000000); HasTable larda keyy null olamaz =>NullPointerException

//        countryPopulation.put("France", null);   Hashtable larda value null olamaz. NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();

        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 33, true));
        myStudents.put("Science", new Students("Mary Star", "ms@gmail.com", 32, false));


        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);

        int age = myStudents.get("Math").age;
        System.out.println(age);



    }
}
