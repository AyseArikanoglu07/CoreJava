package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu le non primitive arasıindaki farklar nelerdir?
        String str="Java";
        int sayi=10;

        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);
        //non-primitive data turleri data depolamak yanında birçik faydalı methoda sahiptir
        //ancak primitive data turlerinin oyle bir ozelligi yoktur
        //primitive data turleri sadece degerleri saklarlar(container)

        //primitive data turler,içinde bazi methodlar gherektiginde java ara cozum uretmistir
        //java her bir primitive data turunu non primitive olarak kullanabilmek icin
        //ozel classlar olusturmus ve bunlara Wrapeper class adini vermistir

       double sayi2=20.5;

       //sayi 2 primitiv old sayi2 yazinca method gelmez

        Double sayi3=15.2;
        //sayi3 wrapper class olan Double classini kullandigindan sayi3. dersek bircok method gelir




    }
}