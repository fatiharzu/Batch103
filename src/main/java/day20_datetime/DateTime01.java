package day20_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime01 {
    public static void main(String[] args) {
        // Example 3 Anlik tarihi (Current Date) ve anlik zamani current time ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4 Japonyadaki anlik tarihi current date ve anlik zaman current time ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //Example 4 Istanbuldaki anlik tarihi current date ve anlik zaman current time ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);





    }
}
