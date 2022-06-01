package day06_concatenationOperators;

public class C02_mantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8 ;//true
                     //t    t       t      t

        //! esit degildir isareti
        //&& isareti ile birlestirilen tum ifadeler dogru ise true, bir tanesi bile yanlissa false verir
        //|| isareti ile birlestirilen tum ifadeler yanlıs ise false, diger tum durumlarda true doner
        //& isarti kullanilirsa java esitligin iki tarafindaki ifadeleri da kontrol eder
        // ama kod yavaslar, bir yanlis bulsa bile kontrole devam eder ve sonunda false doner
        //&& java en bastan kontrole baslar ve mantiksal ifadelerde ilk yanlisi bulduktan sonra kontrolü birakir
        //kod hizli calisir

        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8 ;//false
                      //t       f       t        t
        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;//false
                     //  t     f      t       t
        System.out.println(sonuc3);

        int sayi3=15;

        //sayi 3 un 10 ile 20 arasinda oldugunu true dierek dondurelm
        //java 3 lu kartsılstırma kabul etmez,2li karsilastirma yapip mantiksal opr.ile birleştirilmeli

        System.out.println(10<sayi3 && sayi3<20 );//true
                         //t             t

        //sayi 4 un 10 ie 15 arasinda olmadigini true dondurelim

        int sayi4=5;

        System.out.println(sayi4<10 || sayi4>20);





    }
}
