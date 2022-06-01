package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        java pass value bir programlama dilidir yani bir primitive variable i argument olarak bir methoda yollarsaniz
        java o variable i degil degerini(value)metoda aktarir(pass eder)
         */

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main methodda etiket fiyati : " + etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati)
    //pass by value methoddaki etiketFiyatı ile main methoddaki etiketFiyatı aynı variable değil
    // main methoddan methoda  etiketFiyatı variablını degil value(assign edilen degeri) sunu goturur
     {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin indirimli fiyatimiz : " + etiketFiyati);

    }
}
