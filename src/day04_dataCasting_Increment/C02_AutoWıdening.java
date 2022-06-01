package day04_dataCasting_Increment;

public class C02_AutoWıdening {

    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str=dogruMu;//sol string sag boolean olursa java kodu kabul etmez


        byte sayi1=44 ;
        System.out.println(sayi1);

        short sayi2= sayi1;
        System.out.println(sayi2);//esitligin solu short, sagi ise byte olmasina ragmen java itiraz etmiyor
                                  //hem short hem byte sayilarin kullanildigi data turleridir

                                 //deger olarak atanan data turu variable data turunden kucuk oldugu icin
                                 //  java sorun yapmaz
                                 //buna auto widening denir
        System.out.println(sayi2);

        double sayi3=sayi2;
        System.out.println(sayi3);





    }
}
