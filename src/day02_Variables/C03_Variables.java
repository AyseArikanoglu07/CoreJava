package day02_Variables;

public class C03_Variables {
    public static void main(String[] args) {
        String ogrenciIsmi="Melih";
        System.out.println(ogrenciIsmi);

        ogrenciIsmi="Furkan";
        System.out.println(ogrenciIsmi);



        //bir variable deklare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak deklare edilen bir variable tekrar deklare edilemez.
        //ikinci kez String data türünde ogrenci ismi  deklare edilemez java kabul etmez
        //deger degisir degisken degişmez
        // String ogrenciIsmi="Abdullah";

        String isim, soyisim, dogumYeri;
        isim="ayse";
        soyisim="arikanoglu";
        dogumYeri="gundogmus";
        System.out.println( isim);
        System.out.println(soyisim);
        System.out.println(dogumYeri);

        String tckn="13402569808";
        System.out.println(tckn);

        String hiclik= "";
        System.out.println(hiclik);

        // String non-primitive oldugu icin biz sadece data saklamiyor ekstra bazi ozellikleri de kullanabiliyoruz
        // Tc No, okul no , Tel no gibi kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin de String kullanilabilir

        String ilkHarf="A";
        char harf2='A';
        System.out.println(ilkHarf);
        System.out.println(harf2);

        // bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir

















    }

}
