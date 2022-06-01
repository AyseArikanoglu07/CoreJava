package day33_varrargsStringBuilder;

public class C01_Varrargs {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";

        /*yazilan argument sayisi sabitse herzamanki gibi bir method olusturulabilir
        ancak argument sayisinin degisme ihtimali varsa o zaman varrargs tercih edlimeli

         */


        enuzunkelime(str1,str2,str3);
    }

    public static void enuzunkelime(String... str) {

        String enUzunStr="";

        for (String each:str
             )
        {
            if (each.length()>enUzunStr.length());

        }
        System.out.println("en uzun kelime: " + enUzunStr);


    }
}
