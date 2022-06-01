package day34_AccessModifier_enCapsulation;

public class C04_EnCapsulation {
    public static void main(String[] args) {
        /*
        bir variable encapsule etmek icin
        1-access modifier ı private yapariz
        2-okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabiliriz
        eger sadece okunmasini istersek getter,
        sadece deger girilebilsin ama okunamasin istersek setter metodlarinda olustururuz

        bir variable icin hem getter hem setter olusturursaniz
        o variable public olmus gibi hem okuyup hem yazilmasini saglayabilirsiniz
         */


        C03_EnCapsulation obj = new C03_EnCapsulation();
        obj.getSayi();
        System.out.println(obj.getSayi());

        obj.setStr("Java java java");//instance variable dan geldi
        System.out.println(obj.getStr());

        System.out.println(obj);
    }


}
