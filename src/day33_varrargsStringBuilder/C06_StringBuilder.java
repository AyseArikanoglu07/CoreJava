package day33_varrargsStringBuilder;

import javax.crypto.spec.PSource;

public class C06_StringBuilder {
    public static void main(String[] args) {


    StringBuilder sb1=new StringBuilder("Prize Dikkat");
    StringBuilder sb2=new StringBuilder("prize dikkat");
        System.out.println(sb1.insert(12," edin"));
        String str="hayatta cok guzel seyler vardir";
        System.out.println(sb1.insert(0,str,0,8));
        System.out.println(sb1.reverse());
        System.out.println(sb1);
        System.out.println(sb1.reverse());
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
        System.out.println(sb1.substring(3,5));
        System.out.println(sb1);
        System.out.println(sb1.subSequence(3,5));
        System.out.println(sb1);



    }


}
