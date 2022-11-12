package day27exceptions;

/**
 * <lu>
 *     <li>Java Exception lar  olusturarak  Developer larin Java kurallarina uymalarini temin etmistir.</li>
 *     <li>Biz de Application uretirken kendi Exceptionlarimizi olusturarak diger developer larin bizim ortaya koydugumuz kurallara uymalarini temin ederiz</li>
 *     <li>Java nin degil bizim urettigimiz exceptionlara Custom Exception denir</li>
 *     <li>Custom Exception lar da RuntimeException ve CompileTimeException olabilir</li>
 *     <li>Custom RuntimeException uretmenk icin extends RuntimeException deriz</li>
 *     <li>Custom CompileTimeException uretmenk icin extends CompileTimeException deriz</li>
 * </lu>
 */
public class Exceptions03 {
//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
public static void main(String[] args) throws IllegalGradeException {
    printGrades(60);

    checkNameFormat("Ali");

}

//Ögrenci notlarini yazdirian bir method olusturunuz
    public static void printGrades(double grade)  {

        if(grade<0 || grade>100){
            throw new IllegalNameException("Grade 0 dan az 100 den cok olamaz");
        }else {
            System.out.println(grade);
        }
    }

    //Verilen ismin ilk harfinin buyuk olmamasi durumda Exception atan method yaziniz

    public static boolean checkNameFormat(String name){

    if(name.charAt(0)>= 'A' && name.charAt(0)<='Z') {
        return true;
    }else {
        throw new IllegalNameException("Isimler buyuk harle baslamalidir.");
    }

    }

//    endregion

}
