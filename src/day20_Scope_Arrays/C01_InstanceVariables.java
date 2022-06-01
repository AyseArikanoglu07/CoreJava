package day20_Scope_Arrays;

public class C01_InstanceVariables {

    //instance variable lara object variable denir
    // ve yapılan degisiklikler sadece o objeyi ilgilendirir

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;


    public static void main(String[] args) {
        //sayi=10; sayi variable ı static olmadigi icin main methoddan direk kullanilamaz
        //instance variable lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir
        //class ismşini kullanarak obje olusturmaliyiz,scanner gibi, random gibi,

        C01_InstanceVariables obj1=new C01_InstanceVariables();//0
        System.out.println(obj1.sayi);

        //sayi=10;java kabul etmez ancak soyle olabilir;
        obj1.sayi=10;//10
        System.out.println(obj1.sayi);

        obj1.bransIsmi="SQL";
        System.out.println(obj1.bransIsmi);
        System.out.println(obj1.okuldaMi);//false

        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi);//0
        System.out.println(obj2.bransIsmi);//Java

        System.out.println(obj1.okuldaMi);//false

        obj2.okuldaMi=true;
        System.out.println(obj2.okuldaMi);//true








    }

}
