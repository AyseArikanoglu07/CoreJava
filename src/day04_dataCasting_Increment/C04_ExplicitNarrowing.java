package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;//87,9
        System.out.println(sayi3);

        int sayi4=(int) (sayi1/sayi2);//87.9 int olmaz double dir
                              //deger double variable int yani variable daha dar
                              //dolaysiyla java bunu otomatk olarak yapmaz
                              //sorumlulugu ustlenmemizi ister
                              // sagdaki(int) sorumluluk bende demek
        System.out.println(sayi4);

        int sayi5=sayi1/(int)sayi2;
        System.out.println(sayi5);

        int sayi6=140;
        byte sayi7=(byte)sayi6;//sagdaki deger int>soldaki variable byte
        System.out.println(sayi7);

        sayi6=130;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=158;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=260;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=520;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=-130;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);

        sayi6=44;
        sayi7=(byte)sayi6;
        System.out.println(sayi7);





    }
}
