package day33_varrargsStringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("yasasin Java");


        System.out.println(sb1.indexOf("J"));
        System.out.println(sb1.lastIndexOf("s"));
        System.out.println(sb1.indexOf("s"));
        System.out.println(sb1.replace(0,8,"ne guzel "));
        System.out.println(sb1);
        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA
        System.out.println(sb1);//ne guzel Java
                               // once Stringe cevirip sonra buyuk harf yaptigimiz icin
                               // immutable olarak tekrar yazarsakkucuk harfle yazar
        System.out.println(sb1.delete(0,3));//guzel Java
        System.out.println(sb1.deleteCharAt(6));//guzel ava

    }
}
