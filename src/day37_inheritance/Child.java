package day37_inheritance;

import day36_Inheritance.ParentC;

public class Child extends ParentC {
    
    //Child classta tum conslarin ilk satirina
    //javanin yerlestirdigi cons PARAMETRESİZ dir: super()
    Child(){//3
        super();//4--super cons call ParentC consuna ulasmaya ve oradaki consu calistirmak ister
        System.out.println("child class parametresiz cons");//8


    }//9
    Child(int s){
        System.out.println("cild class parametreli cons");
    }
    Child(int sayi1,int sayi2){
        //eger parent classtan parametresiz consu değil de başka bir consu calistirmak isterseniz
        //bunu child class taki consun ilk satirina yazmalisiniz
        super(sayi1,sayi2);


        System.out.println("iki parametreli cons");
    }

    public static void main(String[] args) {//2
        Child child =new Child(5,8);//1//10
    }
}
