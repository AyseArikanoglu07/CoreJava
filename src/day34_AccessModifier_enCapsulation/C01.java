package day34_AccessModifier_enCapsulation;

public class C01 {
    //1.adim
    private static int sayi=10;
    private static String str="Java";
    //C01(){} 1.adimda var 3. adimi gormek icin aciklamaya aldim

    //3.adim
    static int acikSayi=20;//access modifieri default access modifierdir
    static String acikstring="Hi";//access modifieri default access modifierdir

    //12.adim
    public static int halkaAcik=15;
    
    //16.adim
    protected static int aileyeOzel=40;


    //15.adimda C01 consunu protected yaptik
    protected C01(){

    }
    //8.adim

    C01(int no){
        //bu consun access modifieri default access modifier dir
        //icinde oldugumuz pacage disinda bu classtan obje olusturulamaz

        //10.adim
        System.out.println("parametreli cons calisti");

    }

    //6.adim

    private void method1(){

    }

}
