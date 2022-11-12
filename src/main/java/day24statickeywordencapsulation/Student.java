package day24statickeywordencapsulation;

/**
 *     Encapsulation: "Data Hiding" demektir..<br>
 *     Data'yi nicin gizlersin? Datayi dis etkenlerden korumak icin <br>
 *     Datayi nasil gizlersiniz Acces Modifier ini "private" yaparak gizlerim<br>
 *     "get" methodlar(getter) olusturarak gizledigimiz data lari okunut hala getirebiliriz.<br>
 *
 *     Datayi gizledikten sonra baska Class lardan gelistirmek istersen ne yaparsin?<br>
 *     "set" methodlar(setter) olusturarak   gizledigimiz    data lari okunut hala setirebiliriz.<br>
 *     Variable nin data type i ile get method un return type i ayni olmalidir.<br>
 *     "get" methodlari isimlendirirken "get+<variable name>
 *         ancak variablelnin data tipi "boolean" is "is+<variable name>
 *
 */

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
