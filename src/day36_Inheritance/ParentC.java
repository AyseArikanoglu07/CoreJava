package day36_Inheritance;

public class ParentC {
    protected ParentC(){//5--access modifier protected yapinca super()deki kod hatasi ortadan kalkti
        System.out.println("Parent parametresiz cons calisti");//6

    }//7
    protected ParentC(int sayi3,int sayi4){
        System.out.println("Parent 2 parametreli cons ");

    }
    protected int sayi;
    /*3 super () gider*/

}
