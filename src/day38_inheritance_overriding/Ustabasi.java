package day38_inheritance_overriding;

public class Ustabasi extends Isci{
    public String statu="Ustabasi";
    public String Hklar="ustabasi haftada 1 gun extra tatil hakkina sahiptir";
    public void mesai(){
        System.out.println("ariza varsa ustabasi extra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("ustabasi 30gun*8 saat*12 euro= " +(30*8*12));}

    public static void main(String[] args) {

        /*
        icinde oldugumuz classtan klasik haliyle bir obje olusturursak o obje ile cagirdigimiz
        variable ve methodlqrda Java once icinde bulundugumuz classa bakar
        aradigimiz class uyesi icinde oldugumuz clasda varsa bize onu getirir
        yoksa parentlara bakar ilk buldugunu getirir
         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu +" yasin");
        System.out.println(yasin.Hklar);
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();


        /*
        eger isci olarak ozelliklerini gormek istersek:
        class adini (data turu) isci seceriz
         */
        System.out.println();
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu+" ahmet");
        System.out.println(ahmet.Hklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();
        yasin.mesai();


        System.out.println();
        Personel adem=new Ustabasi();
        System.out.println(adem.statu+" adem");
        System.out.println(adem.Hklar);
        //System.out.println(adem.ikramiye);CTE verir ikramiye personelde degil isci classinda tanimlanmistir,
        //objeyi personel tanimlayinca isci haklarindan degil personel haklarindan yararlanabilir
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();

        // Personel adem=new Ustabasi();bu bir ustabasi objesidir
        // Personel adem=new Personel();bu bir personel objesidir

        /*
         Personel adem=new Ustabasi();
         ademin data turu personeldir, boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz
         Ancak;
         ben ademin ustabasi oldugunu bliyorum cunku constructor ı ustabasi
         Ama bu yazim formati ile ademin tum personel ile birlikte sahip oldugu
         ortak ozellikleri vurgulamak istiyorum
         bu kullanim seklinde olusturulan obje data turu olarak secilen class ve onun parent
         classlarındaki variableı kullanabilir

         */



       }
    }

