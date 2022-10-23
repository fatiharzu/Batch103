package day21accessmodifiersinheritance;
/**
 * <h1>Access Modifier</h2>
 *
 * <ul>
 *     <li>public</li>
 *     <p>public her class dan kullanilabilir</p>
 *     <li>protected</li>
 *     <p>protected olanlar baska package lerden kullanilamaz ancak baska package de child class icinden kullanilabilir.</p>
 *     <li>default</li>
 *     <p>default olanlar  sadece olusturulduklari package lerde kullanilabilir diger package lerde kullanilamaz</p>
 *     <li>private</li>
 *     <p>private olanlar sadece olusturulduklari Class icinde kullanilabilirler</p>
 *
 *     <h3>Note1:</h3><p>Acces Modifier leri genisten dara dogru sayiniz</p>
 *
 *     <h3>public > protected > default > private</></h3>
 *
 *      <h3>Note2:</h3><p>Access modifierleri birer birer aciklayiniz</p>
 *               <li>public olanlar her class'dan kullanilabilir</li>
 *               <li> protected olanlar baska package'lerden kullanilamaz ancak baska package'de "child class" icinden kullanilabilir</li>
 *               <li> default olanlar baska package'den kullanilamazlar</li>
 *               <li>private olanlar sadece olsturulduklari Class icinde kullanilabilirler</li>
 *      <h3>Note3:</h3> <p>"protected" ile "default" un farkini soyleyiniz.</p>
 *      <h4> protected olanlar baska package'lerden kullanilamaz ancak baskapackage'de "child class" icinden kullanilabilir
 *                default olanlar baska package'den kullanilamazlar</h4>
 *      <h3>Note4:</h3><p>Class'lar icin hangi Access Modifier'lar kullanilabilir.</p>
 *          <h4> public, default kullanilir ama protected ve private kullanilamaz</h4>
 * </ul>
 */
public class Student {


    public String stdName = "TomHanks";
    protected String address = "Miami";
    String email = "th@gmail.com";
    private String stdId = "20206517004";



}
