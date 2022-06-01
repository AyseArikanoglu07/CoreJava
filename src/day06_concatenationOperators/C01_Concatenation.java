package day06_concatenationOperators;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;
        //variablelarin degerlerini degistirmeden asagidaki ifadeleri, bu variablelari kullanarak yazdirin

        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));
       //cıkarma islemi solda ve carma en sagda olsa da oncelkli
        // old icin parantezsiz yapar

        //Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Guzel
        System.out.println(""+sayi1+sayi2+str2);

        //en basa hiclik koyulursa tamamini string yazar

        /* eger tamamen sayilardan oluısan bir string varsa ve biz bunu int a cevirmek istersek
        Integer.valueOf(str)
        bir sayiyi stringe cevirmek istersek
        ""+sayi

         */

    }
}
