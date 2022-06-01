package day04_dataCasting_Increment;

public class C05_IncreementDecerement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);//30

        System.out.println(sayi);//20
        //eger atama yapmazsak sayida yaptigimiz artirma veya azaltma kalici olmaz

        //1.yol

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+=10);
        System.out.println(sayi);

        //2.yol

        System.out.println(sayi+=10);
        System.out.println(sayi);

        //bir variable in degerini kalici olarak artirmak veya azaltmak isterseniz
        //assignment sart

        //3.yol
        System.out.println(sayi++);//50, 1artırdı ama ikinci satırda artırdığı halini yazdırdı
        System.out.println(sayi);//51

        //24.satir 25.satir

        System.out.println("29.satir:" + sayi);
        System.out.println("30.satir:"+ ++sayi);




    }
}
