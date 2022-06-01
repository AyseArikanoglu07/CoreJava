package day16_MethodCreation;

public class C02_overLoading {
    public static void main(String[] args) {


        String str="Bu da gecer ya Hu";
        str.indexOf("d");
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a",5));
        //System.out.println(str.substring('a', "t"));t data turu farklı old icin kırmızı ciziyor
        System.out.println(str.indexOf('a',5));
        //bir class da aynı isimde birden fazla method olmasına overloading denir
        //ya parametre sayisi farkli olmali
        // veya parametre sayisi ayni ise argumentlerin data turleri farkli olmali
    }
}
