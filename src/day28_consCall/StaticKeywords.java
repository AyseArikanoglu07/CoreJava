package day28_consCall;

public class StaticKeywords {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
       // System.out.println("sayi1" + sayi2);int sayi2 static olm main method static old sayi2 ye ulasamayiz
        StaticKeywords obj1=new StaticKeywords();
        System.out.print(obj1.sayi2);
        System.out.print(obj1.sayi1);

        sayi1++;
        obj1.sayi2++;
        System.out.print("sayi1" +"," + obj1.sayi2);

        StaticKeywords obj2=new StaticKeywords();
        System.out.print(obj2.sayi2);
        System.out.print(obj2.sayi1);
        //static variables objeden bagimsizdir, classa baglidir
        // Class icindeki her degisiklik static variablesda kalici olur;
        // instance variables objeye bagimlidir, sadece obje uzerinden erisilebilir
        // ve bir obje uzerinden erisilerek yapilan degisiklik instance variable ı kalici degistirmez
        // sadece o obje icin ins var degerini kalici degistirir

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi1);
        System.out.println(obj2.sayi2);

        System.out.println(obj1.sayi2);
        System.out.println(obj1.sayi1);

    }


}
