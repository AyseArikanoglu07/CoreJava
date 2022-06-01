package day32_dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now();//objenin olusturdugu tarihi trh ye atar
        LocalDate baskaTrh= LocalDate.of(1981 , 9 , 8 );//verilen gun ay yil bilgisine gore obje olusturur
        LocalDate yeniTarih=LocalDate.of(1981 , Month.SEPTEMBER ,8);
        System.out.println(baskaTrh);
        System.out.println(yeniTarih);
        System.out.println(trh);

        //get. methodlariyla tarih ile ilgili bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());//1
        System.out.println(trh.getDayOfWeek());//frıday
        System.out.println(trh.getMonthValue());//4
        System.out.println(trh.getYear());//2022
        System.out.println(trh.getDayOfYear());//91

        //-bir tarihte istedigimiz kadar ileri geri gidebiliriz
        //.minus ile geriye ; .plus ile ileriye gidebiliriz
        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusDays(3));
        System.out.println(trh.plusWeeks(20));
        System.out.println(trh.plusWeeks(5).plusDays(3));

        //istedigimiz ulkenin o anki zamanini gösterir
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);

        //is ile baslayan methodlar true7false sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear());//artik yilmidir-false
        System.out.println(LocalDate.now().isAfter(baskaTrh));//baska tarih bugunden once mi-true

    }
}
