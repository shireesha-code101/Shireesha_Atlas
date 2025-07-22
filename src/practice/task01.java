package practice;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class task01 {
    public static void main (String[] args) {
        LocalDate mydate = LocalDate.now();
        LocalDate today = LocalDate.now();
        LocalTime today1 = LocalTime.now();
        LocalDateTime today2 = LocalDateTime.now();
        System.out.println(mydate);
        System.out.println(today1);
        System.out.println(today2);

    }

}
