package day25exception;

public class E03 {
//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
public static void main(String[] args) {

    String str = "Ali";

    getNumOfChars(str);

    String s ="";

    getNumOfChars(s);

    String t = null;
    getNumOfChars(t);
}

    private static void getNumOfChars(String str) {
    try {
        System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("Hata!!!!");
        e.getStackTrace();
        System.err.println("Hataaaa!!!");
    }

    }
//    endregion

}
