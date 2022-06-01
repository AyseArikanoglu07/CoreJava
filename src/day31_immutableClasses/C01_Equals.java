package day31_immutableClasses;

public class C01_Equals {
    public static void main(String[] args) {

        String str1="Eren";
        String str2="Eren";//eger yeni obje olusturma(new string) ya da islem yapma yoksa
                           // java String havuzunu kontrol eder
        String str3=new String("Eren");
        String str4=str1+"";
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true

        System.out.println(str1==str2);//true (== hem degere hem referansa bakar,true verir)
        System.out.println(str1==str3);//false (== Stringde her zaman true vermez,java once sag tarafi kontrol eder
                                       //sag tarafta yeni bir obje olusturulmus(new keywordu ile)
                                       //yeni bir referans duzenler icine eren degerini verir)
        System.out.println(str1==str4);//false(yeni bir obje olusturur str4,
                                       // yeni referans olusturur ve farki gorur false doner
    }

}
