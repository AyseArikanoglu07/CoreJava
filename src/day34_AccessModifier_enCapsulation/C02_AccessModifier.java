package day34_AccessModifier_enCapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {
        //2.adim
        C01 obj = new C01();

        //4.adim
        obj.acikstring = "Bye";
        C01.acikSayi = 50;

        //5.Adim
        //C01.sayi=15; ==> sayi access modifieri private old icin baska classtan ulasamam

        //7.adim
        //obj.method1() ==> method1 access modifieri private old icin baska classtan ulasamam

        //9.adim
        C01 objParametreli=new C01(50);
        //C01 constructor private access modifier olsaydi ulasamazdik


    }
}