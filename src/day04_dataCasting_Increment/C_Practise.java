package day04_dataCasting_Increment;

public class C_Practise {
    public static void main(String[] args) {
        // java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        // eger virgulden sonra kusurat varsa siler

        int sayia=3859;
        int sayib=12;

       sayia=sayia/sayib;//26
       System.out.println(sayia=sayia/sayib);
       sayia=sayia/sayib;//0
       System.out.println(sayia=sayia/sayib);


       /* sayia=4895;
        double sayiz=10;
        sayia=sayia/sayiz;
        System.out.println(sayia=sayia/sayiz);
        // sayia=sayia/sayiz; // iki farkli sayi data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autoWidening yapar
        // bu islemi dusunursek sayia/sayiz => islemin sonucunu double kabul eder
        System.out.println(sayia/sayiz);
        System.out.println(sayiz/sayia); bu kod hata veriyor!!!!
        */
        double sayix=3859;
       double sayiy=12;
       sayix=sayix/sayiy;
       System.out.println(sayix=sayix/sayiy);
        sayix=sayix/sayiy;
        System.out.println(sayix=sayix/sayiy);
        sayix=sayix/sayiy;
        System.out.println(sayix=sayix/sayiy);
        sayix=sayix/sayiy;
        System.out.println(sayix=sayix/sayiy);//enterasan:)


        byte sayi1=24;
        short sayi2=368;

        System.out.println(sayi2);
        System.out.println("sayi1 : " + (sayi2/sayi1));

        sayi1=36;
        int sayi3=12;
        sayi3=sayi1/sayi3;
        System.out.println(sayi3);

        float sayi4=310.84f;
        double sayi5=239;

        sayi5=sayi4;
        System.out.println(sayi5);





    }
}
