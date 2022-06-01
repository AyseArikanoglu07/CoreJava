package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        //bazen ternary deki iki sonucun data turleri farkli olabilir
        //verilen sayi 100 den buyukse sayi nin karesini alip yazdiran
        // 100 den kucukse "sayi 100den buyuk olmali" yazdiran bir ternary olusturalim

        int sayi=150;

        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degişkene atamaliyiz
        //eger sonuclar farkli data turlerindeyse atam yapilacak variabe in data turu tek olacagindan atama yapamayiz

        //sadece direk yazdirabiliriz


        System.out.println(sayi>100? sayi*sayi : "sayi 100 den buyuk olmali");

    }
}
