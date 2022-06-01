package day05_matematikselIslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;

        //bu sayiyi 1 artirmak istersek

        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println("pre-incrementten once"     +     sayi); //12

        System.out.println("pre-incrementten satirinda"    +       ++sayi); //13 once artir sonra yazdir

        System.out.println("pre-incrementten sonra"  +   sayi);

        System.out.println("post-increment satirinda"    +     sayi++); //once yazdir sonra artir
        System.out.println("post-increment satirindan sonra"    +     sayi);  //14

    }

    }

