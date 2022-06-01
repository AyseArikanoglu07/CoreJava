package day30_passByValue;

public class C04_PassByValue {
     /*
     eger bir methodda yapilan degisikligin kalici olmasini istersek iki yontem kullanabiliriz
     1- variable i class levelda static olarak olusturabiliriz


      */

    static double etiketFiyati;
    static double indirimYuzdesi;
    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();

    }

    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat: " + etiketFiyati);


    }
}
