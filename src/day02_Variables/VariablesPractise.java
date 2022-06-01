package day02_Variables;

public class VariablesPractise {

    public static void main(String[] args) {

        //2.gun calismasi

        System.out.println("ders calismaya baslaman iyi oldu");
        System.out.println("gunde kac saat calismayi dusunuyorsun" );
        int dersSaati = 4;
        System.out.println(dersSaati);

        System.out.println("soyle bakalim ilk harf ne");
        char ilkHarf ='A';
        System.out.println(ilkHarf);

        System.out.println("ogrendigine emin misin");
        boolean eminim = true;
        System.out.println(eminim);

        System.out.println("kursu tamamlama ihtimalin kac" );
        double ihtimal = 98.98;
        System.out.println(ihtimal);

        System.out.println("egitimin kacinci gununde");
        byte gun=6;
        System.out.println(gun);

        System.out.println("egitimin daha kac gun devam edecek");
        short gelecekGunSayisi=144;
        System.out.println(gelecekGunSayisi);

        String OgrenciIsmi="Muhittin";
        System.out.println(OgrenciIsmi);

        OgrenciIsmi="Ilker";
        System.out.println(OgrenciIsmi);


        //bir variable deklare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak deklare edilen bir variable tekrar deklare edilemez.
        //ikinci kez String data türünde ogrenci ismi  deklare edilemez java kabul etmez
        //deger degisir degisken degişmez
        // String OgrenciIsmi="Abdullah"; denersek hata verir

        String Ad , Soyad, DogumYeri;
        Ad="Ayse";
        Soyad="Arikanoglu";
        DogumYeri="Gundogmus";
        System.out.println(Ad);
        System.out.println(Soyad);
        System.out.println(DogumYeri);

        String tckn="13402569808";
        String hiclik="";
        String IlkHarf="A";
        char ilk_harf='A';
        System.out.println(tckn+ ""  +  hiclik   +  ""  +  IlkHarf);
        System.out.println(tckn);
        System.out.println(hiclik);
        System.out.println(IlkHarf);
        System.out.println(ilk_harf);






        }












    }

