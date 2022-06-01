package day30_passByValue;

public class C01_StaticBlocks {

    static{/*class calismaya baslamadan yapmamiz gereken on atamalar varsa onlari yapar
           yeri onemli degil static block class ilk calsmaya basladiginda devreye girer
           ve classin calismasi icin gerekli on hazirliklar icin kullanilir
           yazildigi satirin onemi yok class icerisinde isteen yerde olabilir
           static block birden fazla olursa bloklar yukaridan asagi dogru sirayla calisir*/

        System.out.println("static block calisti");//static blocks herseyden ve herkesten once calisir
    }

    C01_StaticBlocks(){
        System.out.println("cons calisti");//calismadi cunku obje yazmadik



    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();//bu satir olustukltan sonra "cons calisti" yazar


    }
}
