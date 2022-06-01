package day40_overriding_polymorphysm;

public class C02 extends C01 {

    public void method2(){
        System.out.println("child method calisti");
    }

        /*Notasyonu overridin method ile overriding methodu birbirine baglar
        dolayısıyla farkında olunmadan overridin method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin Java CTE verir
        Notasyon kullanilmazsa;
        Java bunlarin iliskisini bilir ama overridin method silinirse sesini cikarmaz

         */



    public static void main(String[] args) {
    /*
    signature ,
    */

        C02 obj =new C02();
        obj.method1();//signature method ismi ve parametrelerden olusur
        obj.method2();

        C01 obj2=new C02();
        obj2.method1();
        obj2.method2();

        C01 obj3=new C01();
        obj3.method1();
        obj3.method2();



    }
    protected String method3() {
        return "java";


    }
}