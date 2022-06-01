package day45_Interfaces;

public class C02_DefaultStaticMethod implements I01_DefaultVeStatic{

    /*
    Bir Interface de default veya static olarak tanimlanan ve body si olan methodlarin
    override edilmesi mecburi degildir

    Eger static olarak tanimlanmissa zaten override edemeyiz
     */
    @Override
    public void method1() {

        System.out.println("child class method 1");

    }
    /*
            parent interfacedeki methodu istersek override ederiz istemezsek etmeyiz
            override etmezsek method cagrildiginda parent interface calisir
            override edersek child classtki override method calisir

    @Override
    public void method2() {
        System.out.println("child class method 2");

    }*/

    public static void main(String[] args) {

        /*
        Interface de static olarak tanimlanan methodlara
        static yontemlerle ulasilabilir;
        InterfaceIsmi.methodIsmi

         */

        I01_DefaultVeStatic.method3();
        C02_DefaultStaticMethod obj=new C02_DefaultStaticMethod();
        obj.method1();//child class
        obj.method2();//parent interface
        //obj.method3();eski classlarda static bir uyeye static olmayan
        //yollarla da ulasilabilirdi anca interface icinde static tanimlanan methoda
        //static olmayan yontemlerle ulasilamaz, obj ile cagrilamaz







    }
}
