package day32_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);

        //bir islemin ne kaar surede bittigini bulmak icin
        //islemden once ve sonra birer time objesi olusturup ardaki farki hesaplayabiliriz
        int sayi=100000;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;

        }

        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tm);//LocalTime tm=LocalTime.now();objeyi olusturdugumuz andaki degeri alir
        System.out.println(tmLoopSonrasi);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1) +     " saniyede bitti");


        //ileriye veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        LocalTime zoneTm=LocalTime.now(ZoneId.of("Japan"));
        System.out.println(zoneTm);







    }
}
