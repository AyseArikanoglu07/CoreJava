
package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {


        Cons01 obj1 = new Cons01();//default cons devrede
        /*Con01 classinda hic cons olusturmazsak java default consu kullandigindan
        obj1 i uretebiliriz Ancak biz parametreli veya oparametresiz bir cons yazdirirsak
        java default consu siler

        Biz herhangibir cons olusturdugumuzda daha once baska classlar veya kullanicilarin
        olusturmus olabilecegi objeleri kullanabilmeleri icin
        default consun islevini gerceklestirecek parametresiz bi, cons olusturmakta fayda var

        */

        Cons01 obj2=new Cons01("java");



    }
}