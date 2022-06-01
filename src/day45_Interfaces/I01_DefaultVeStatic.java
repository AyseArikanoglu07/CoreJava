package day45_Interfaces;

public interface I01_DefaultVeStatic {
    /*
    Interface lerde sadece abstract methodlar bulunur
    body si olan concrete bir method olusturmak istersek java cte verir
    ancak java8 ile birlikte istisnai olarak static veya default olarak tanimlanan methodlarin bodysi olabilir

    Ancak burada kullanilan default keywordu access modifier degildir
    Cunku interfacelerde tum methodlar public ve abstract tir

    Asagidaki ornekte gorulecegi gibi default olarak tanimlanmis bir methoda
    acess modifier olarak public yazabilirsiniz

    Access modifier yazmasak bile java public olarak kabul eder


     */




        void method1 ();
        public default void method2 () {
            System.out.println("interface deki default method");

        }
        static void method3 () {//static old icin classta override edilemez
            System.out.println("interfacedeki static method");

        }
    }
