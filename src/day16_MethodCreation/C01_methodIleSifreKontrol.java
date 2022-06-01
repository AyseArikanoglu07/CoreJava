package day16_MethodCreation;

public class C01_methodIleSifreKontrol {
    public static void main(String[] args) {
        //kullanicicdan sifre isteyin
        //asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi" yazdirin
        //sartlari saglamazsa "islam basarisiz, Lutfen yeni bir sifre girin" yazdirin
        //-ılk harfbuyuk harf olmali
        //-son harf kucuk harf olmalı
        //-Sifre bosluk icermemeli
        //-Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolu method ile yapin

        String sifre = "Asdf12345a";
        boolean ilkHarfKontrol = ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol= sonHarfKontrolEt(sifre);
        boolean boslukKontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("sifreniz basariyla tanimlandi");
        } else System.out.println("islem basarisiz,yeni bir sifre giriniz");
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false;
        if (ilkHarf>='A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        }else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmalidir");
            //ilkHarfSonuc=false veya true
        }

        return ilkHarfSonuc;

    }

    private static boolean sonHarfKontrolEt(String sifre) {

        boolean sonHarfSonuc=false;


        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sonHarf>='a' && sonHarf<='z'){

        }

        return sonHarfSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc = true;
        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }
        return boslukKontrolSonuc;
    }



    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;
        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc=false;
        }
        return uzunlukKontrolSonuc;

    }

}



