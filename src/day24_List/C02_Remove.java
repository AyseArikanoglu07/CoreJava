package day24_List;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        //ArrayListten eleman silmek icin remove kullanilir

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Oguzhan");
        isimler.add("Berk");
        System.out.println(isimler);

        //isimler.remove("Yusuf");
        //System.out.println(isimler);

        //remove(istenenObject) methodu istenen elementi kaldirip, true veya false doner.
        //boolean bir variable a assign edilirse yaptigi islem kontrol edilebilir
        //kullaniciya yazdirmak icin if-else kullanarak yazdirabilirsiniz
        //remove obj varsa siler yoksa silecek bişey bulamaz silip silmedigini bilmek icin yazdirmak gerekir

        boolean sonuc=isimler.remove("Yusuf");
        if (sonuc==true) {
            System.out.println("istediginiz isim silindi");
        }
        else{
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        isimler.remove("Berk");

        boolean sonuc1=isimler.remove("Yusuf");
        if (sonuc1==true) {
            System.out.println("istediginiz isim silindi");
        }
        else{
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }

        System.out.println(isimler.remove(1));
        System.out.println(isimler);





    }

}
