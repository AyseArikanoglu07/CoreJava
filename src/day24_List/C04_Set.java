package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Oguzhan");
        isimler.add("Berk");
        isimler.add("Ahmet");
        System.out.println(isimler);

        isimler.set(2, "Hakan");
        System.out.println(isimler);

        //daha onceleri listede var olanlari da arsiv gibi tutmak istersek

        List<String>logListesi=new ArrayList<>();
        //isimler.set(1,"Cosmos");
        logListesi.add( isimler.set(1,"Cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);

        //olmayan şndexle set methodu kullanilamaz dolayisiyla add methodu mecburidir


    }
}
