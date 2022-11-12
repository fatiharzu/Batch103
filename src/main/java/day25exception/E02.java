package day25exception;

public class E02 {
//    region Konstanten
//    endregion

//    region Attribute
//    endregion

//    regionKonstruktor
//    endregion

//    regionMethoden
public static void main(String[] args) {
    String arr[] ={"Ali", "Can", "Veli", "Han"};

    getElementFromArray(arr,2);
    getElementFromArray(arr,0);
    getElementFromArray(arr,4);
}

    private static void getElementFromArray(String[] arr, int idx) {

    try {
        System.out.println(arr[idx]);
    }catch (ArrayIndexOutOfBoundsException e){
        //Exception ile ilgili detayli teknin mesaj verir
        e.printStackTrace();
        //Bu teknik olmayan bir aciklama
        System.out.println("Array index icinde bir problem meydana geldi");

        //Hata mesajini diger mesajlardan ayirmak icin kullaniriz
        System.err.println("Array index icinde probem meydana geldi");
    }
    }
//    endregion

}
