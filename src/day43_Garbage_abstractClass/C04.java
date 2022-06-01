package day43_Garbage_abstractClass;

public abstract class C04 {

    /*
    bir abstract classta abstract veya concrete methodlar bulunabilir
    child classlarin; abstract methodlari override etmesi mecburken
                      concrete methodun override edilmesi opsiyoneldir

     */

    public abstract void absMethod1();
    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void concreteStaticMethod(){
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
        //C04 obj=new C04();C04 abstract bir classtir,
        // constructora sahioptir ancak abstract classlardan obje olusturulamaz
        /*abstract classlar obje barindirmayan sadece child classlar icin
        uyulmasi sart olan veya opsiyonel birakilan ozellikleri tanimladigimiz bir depo class gibidir
        */

        System.out.println("bu class abstract");

        concreteStaticMethod();

    }


}
