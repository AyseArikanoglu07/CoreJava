package day36_Inheritance;

public class Child extends ParentC{


  /*2 parent() a gider*/
    Child(){
        super();/*4 new child a gider  */
        System.out.println("Child Cons. calisti");

    }
    //tum classlarda biz gormesek de javanin olsturdugu default cons vardir

    //extends keyword kullanan claslardaki tum constructorlarin ilk satirinda biz gormesek bile super() constructor call vardir
    //yani parent classin parametresiz constructorı 5.satira yazdik
    public static void main(String[] args) {
       /* 1 super() e gider */
       Child child=new Child();


    }
}
