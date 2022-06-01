package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

        tarihSaat.plusDays(3).plusHours(5).plusMonths(6);
        System.out.println( tarihSaat.plusHours(5).plusDays(3).plusMonths(6));
    }
}
