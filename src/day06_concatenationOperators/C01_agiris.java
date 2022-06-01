package day06_concatenationOperators;

public class C01_agiris {
    public static void main(String[] args) {

        String a="hello";
        String b="world";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+" "+b);

        int x=2;
        int y=3;
        System.out.println(a+" "+x+y);//hello 23

        System.out.println(x+y+a);//23hello

        System.out.println(a+(x+y));//hello5

        System.out.println(a+x*y);//hello6



    }
}
