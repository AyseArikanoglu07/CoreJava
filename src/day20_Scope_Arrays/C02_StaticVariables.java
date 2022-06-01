package day20_Scope_Arrays;

public class C02_StaticVariables {

    //ınstance variable lar objeye bagimlidir ve her obje farkli degerler alabilir
    //buna ornek olarak ogrenci notlari veya ogretmen branslari gibi
    //bir objeye ait bir variable ın son degerşni bulmak icin sadece o objeyi dikkate alırız


    //StaticVariable lar ise class variable olarak tanilanir ve tum class uyeleri icin aynidir
    //okulIsmi,okulMudurununAdi gibi,
    //eger static variable ın degeri degistirilirse herkes icin degistirilir


    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;
    public static void main(String[] args) {

        System.out.println(okulIsmi);//main method static diger variable larda static old icin kullanılabilir,
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false

        staticMethod();

        System.out.println(okulNo);


    }


    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);//200
    }
}
