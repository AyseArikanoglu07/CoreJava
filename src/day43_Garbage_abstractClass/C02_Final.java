package day43_Garbage_abstractClass;

public class C02_Final extends C01_Finally{
    public static void main(String[] args) {

        System.out.println(C01_Finally.okulIsmi);

        //C01_Finally.okulIsmi="Java";
        //override da edilemez

    }
    /*public static void method1(){


        ovrride parent classtaki methodu child classa uyarlamakti.degistirmek isteriz
        ancak parent class taki method final tanimlandigindan Java methodun uyarlanmasina izin vermiyor

        System.out.println("Parent Class final method1");
    }*/

}
