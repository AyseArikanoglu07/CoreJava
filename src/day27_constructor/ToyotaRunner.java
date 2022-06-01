package day27_constructor;

public class ToyotaRunner {
    //surucu class
    public static void main(String[] args) {
        Toyota t1=new Toyota();
        System.out.println(t1.marka);//Toyota
        System.out.println(t1.lastikAdedi);//4
        System.out.println(t1.model);//model variable ı icin
                                     //assignment yapilmadigindan default olarak null

        t1.model="corolla";
        t1.yakit="benzin";
        t1.yil=2022;
        System.out.println("T1 modeli: " +t1.model + " ,yakit: "+ t1.yakit + " , yil: " + t1.yil );
        t1.maxHiz();

        Toyota t2=new Toyota();
        System.out.println(t2.model);
        t2.model="yaris";
        t2.yakit="dizel";
        t2.yil=2023;
        System.out.println("T2 modeli: " +t2.model + " ,yakit: "+ t2.yakit + " , yil: " + t2.yil );
        t2.renkTercihleri();


    }
}
