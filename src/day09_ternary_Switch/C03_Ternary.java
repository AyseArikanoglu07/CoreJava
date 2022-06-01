package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=1245;
        //verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden ve sonucu yazdiran bir ternary olusturun

        String sonuc= (sayi >= 100) ? "sayi 3 basamakli veya daha buyuk" : "sayi 3 basamaktan kucuk";

        //ternary bize sonuc dondurdugu icin
        //ya bu sınucu direk yazdirmaliyiz
        //ya da sonucun data furune uygun bir variable a atama yapaniliriz
        System.out.println("girdiginiz sayi analizi : " + sonuc );


    }
}
