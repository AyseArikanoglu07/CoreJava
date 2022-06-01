package day33_varrargsStringBuilder;

public class C02_varrargs {
    public static void main(String[] args) {

        int sayi=5;
        String str1="zulal";
        String str2="zeynep";

        carpimmethodu(sayi,str1,str2);
        
    }
    //bir methodda varrargstan baska bir parametre varsa varrargstan once yazilmalidir
    //bu sebeple bir methodda birden fazla varargs olamaz

    private static void carpimmethodu(int sayi, String... str) {

        String enUzunStr="";

        for (String each:str
        )
        {
            if (each.length()>enUzunStr.length());

        }
        System.out.println("istenen deger: " + enUzunStr.length()*sayi);




    }
}
