package day05_matematikselIslemler;

public class C02_PreincrementPostincrement {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi1 + " ,"+sayi2+", "+sayi3);

        sayi3=++sayi1;

        System.out.println(sayi1 + " ,"+sayi2+", "+sayi3);

        System.out.println(sayi3++);

        System.out.println(sayi3);

        System.out.println(--sayi2);

        System.out.println(sayi2++);
        System.out.println(sayi2);
        System.out.println(-+sayi2);


        //10.03.2022 cuma denedim
        int sayi5=23;
        int sayi6=sayi5++;
        System.out.println(sayi6 +" "+ sayi5);
        sayi6=++sayi5;
        System.out.println(sayi6 +" "+ sayi5);








    }
}
