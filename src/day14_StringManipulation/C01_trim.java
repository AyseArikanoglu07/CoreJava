package day14_StringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str = "  Siz ne derseniz deyin Java bildigini okur  ";
        str.trim();
        System.out.println(str);//atama yapılmadigi icin bosluklar gorulur
        System.out.println(str.length());


        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());



    }


}
