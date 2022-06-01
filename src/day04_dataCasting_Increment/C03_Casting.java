package day04_dataCasting_Increment;

public class C03_Casting {

    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=3;
        System.out.println(sayi1/sayi2);
        sayi1=22;
        System.out.println(sayi1/sayi2);
        //java iki int sayiyi birbirine bolerse sonucu da int olarak verir
        //eger virgulden sonra kusurat varsa siler, yuvarlamaz

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;//478,6
        System.out.println(sayi1);//478

        sayi1=sayi1/sayi2;//47,9
        System.out.println(sayi1);//47

        sayi1=sayi1/sayi2;//4,8
        System.out.println(sayi1);//4

        sayi1=sayi1/sayi2;//0,4
        System.out.println(sayi1);//0

        sayi1=4895;
        double sayi3=10;

        System.out.println(sayi3/sayi1);
        System.out.println(sayi1/sayi3);

        //sayi1=sayi1/sayi3;// iki farkli sayi data turunu isleme koydugumuzda
                          //java kucuk olan data turu icin autowidening yapar
                          //bu islami dusunursek sayi1/sayi3 = islemin sonucunu double kabul eder














    }
}
