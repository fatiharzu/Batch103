package day28_abstraction;
/**
 *        1-  Atomic olsun diye “parent”i parcaladim ama bir “Child Class” in birden fazla “parent” i oldu
 *              bu ise Java’da mumkun degildir.
 *              Cunku Java “multiple Inheritance” i desteklemez
 *
 *              Multiple Inheritance class larda mümkün degildir. Fakat Java interface isimli yeni ir yapi olusturdu.
 *              Bu yapida multiple Inheritance a müsaade etti.
 *
 *        2-  Interface lerdeki tum methodlar abstract oldugu icin interface lere fully abstraction denir.
 *              Abstract Class larda abstract method ve concrete method bir arada kullanildigi icin
 *              Abstract Class lara fully absraction denmez
 */
public interface Engine {

            //interface lerdeki tum methodlar abstract olmak zorundadir.
            //interface lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur.
            //Cünkü Java o methodun abstract oldugunu bilir.

            //interfacelerdeki methodlar Java da tarafindan otomatik olarak public kabul edilir bu yuzden o methodlar icin
            // public yazmaya gerek yoktur.

            // public abstract void eco(); ile  void eco(); ayni anlama gelir
            void eco();

            void gas();

            void tsi();

            // default keyword kullanarak interfacelerin icinde body si olan methodlar uretebilirsiniz.
            //Interface lerin icinde concrete method olusturusaniz ya "default" yada static "keyword" leri kullanmalisiniz.
            public default int add(int a, int b){
                return a+b;
            }

            public static String update(String str){
                return str + "!";
            }
}
