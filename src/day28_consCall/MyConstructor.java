package day28_consCall;

public class MyConstructor {

    int x=5;
   MyConstructor(){//5.adım der ki parametresiz consda int x icin 5 degeri atanmış
                   //11.adım der ki parametresiz consda int x icin 5 degeri atanmış
       System.out.println("-x"+x);//6. adım der ki -x5 yazdir
                                  //12.adım der ki -x5 yazdir
   }//7.adım body sonu geldiğin yere git
    //13.adım body sonu geldiğin yere git
   MyConstructor(int x){//3.adım der ki main methoddan x parametresi 4 geldi

       //***this() ile cons icinden cons cagrilmaktadir***
       //this() kullanilirken cagrildigi consun ilk satiri,na yazilmalidir
       //bu kural sebebiyle sadece 1 cons cagrilabilir,2.this() calismayacaktir
       this();//4.adım der ki consCall yapılıyor o zaman parametresiz constructora git
       System.out.println("-x"+x);//8. adım main methoddan gelen int x degeri 4 ü al ve -x4 yazdır
   }//9.adım body sonu geldiğin yere git

    public static void main(String[] args) {//1.adım main methodla başlar
        MyConstructor mc1=new MyConstructor(4);//2. adım der ki parametreli constructora git
        MyConstructor mc2=new MyConstructor();//10. adım parametresiz consa git
    }//14.adım body sonu kod bitti

}
