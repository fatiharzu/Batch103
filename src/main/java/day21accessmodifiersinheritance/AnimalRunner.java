package day21accessmodifiersinheritance;

/**
 * <h2>Note</h2>
 * <ul>
 *     <h3>1) "Inheritance" sayesinde</h3>
 *     <li>Code tekrarindan kurtuluruz</li>
 *     <li>Code tamiri(maintanance) kolay olur</li>
 *     <li>Child Class lari daha atomic yapmis oluruz</li>
 *
 *     <h3>2) Bir Class i baska bir Class in Child Class i yapmak icin "extends" keyword kullanilir.<br>
 *     Ilk yazilan Class Child, ikinci yazilan Class parent olur</h3>
 *
 *      <h3>3) Child Class object leri Parent Class dan method ve variableleri kullanabilirler</h3>
 *
 *     <h3>4) Parent Class object leri Child Class dan method ve variableleri kullanamazlar</h3>
 *
 *     <h3>5) Object Class her Class in parenti dir <br>
 *     Javada Object Class haric Class in parenti vardir<br>
 *     Java da parenti olmayan tek Class Object Class dir </h3>
 *
 *     <h3>6) <br>"private" method ve variable lar Child Class lar tarafindan kullanilamaz<br>
 *             "protected" method ve variable lar Child Class lar tarafindan kullanilabilir<br>
 *             "default" method ve variable lar Child Class lar tarafindan kullanilabilir<br>
 *             "public" method ve variableler Child Class tarafindan kullanilabilir<br>
 *
 *             Note: child class'lar tarafinda kullanilabilir olmak inherit edilebilir demektir.</h3>
 *
 *     <h3>6) 4 Tip inheritance vardir.</h3>
 *     <li>MultiLevel Inheritance : Java bunu destekler.</li>
 *     <li>Hierarchical Inheritance : Bir parent için çoklu child, Java bunu kabul eder.</li>
 *     <li>Multiple Inheritance : Bir Child a çoklu Parent, Java bunu desteklemez.</li>
 *     <li>Single Inheritance : Bir Child Class için bir Parent Class demektir, Java bunu destekler.</li>
 *
 *
 *
 *
 *
 * </ul>
 */
public class AnimalRunner {
    public static void main(String[] args) {
        System.out.println("-----------------Cat----------------------");
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();


        System.out.println("-----------------Dog----------------------");
        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();


        System.out.println("-----------------Bird---------------------");
        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();
        System.out.println("------------------------------------------");
    }
}
