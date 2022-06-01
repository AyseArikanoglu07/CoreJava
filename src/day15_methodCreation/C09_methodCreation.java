package day15_methodCreation;

public class C09_methodCreation {
    public static void main(String[] args) {

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String KKNo="1234567890123456";

        isimSoyisimGizle(isim,soyisim);
        krediKartiGizle(KKNo);

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");//veya "\\w",
        String yenisoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");


        String yeniKKNo="**** **** **** " + KKNo.substring(12);

        System.out.println("isim-soyisim : "+yeniIsim+" "+yenisoyisim+"\nkart no : "+yeniKKNo);

    }

   public static void krediKartiGizle(String kkNo) {
    }
    public static void isimSoyisimGizle(String isim, String soyisim) {
    }
}
