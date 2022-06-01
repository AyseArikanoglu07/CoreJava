package day39_overriding;

public class Overriding_Child extends  Overriding_Parent {
    public  void method1(){
        System.out.println("child class method1 calisti");
    }

    public static void main(String[] args) {
        Overriding_Child obj1=new Overriding_Child();

        obj1.method1();
        obj1.method2();

        Overriding_Parent obj2=new Overriding_Child();
        obj2.method1();
        obj2.method2();

        Overriding_Parent obj3=new Overriding_Parent();
        obj3.method1();
        obj3.method2();

    }
}
