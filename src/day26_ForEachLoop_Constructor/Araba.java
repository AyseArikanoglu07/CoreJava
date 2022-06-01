package day26_ForEachLoop_Constructor;

public class Araba {
/*javada her class olusturdugumuzda java o class tan ilerie objeler uretmek gerekecegini bilir
  ve biz ozellikle belirtmesek de java her olusturdugu classa bir constructor koyar

  javanin class olustururken classa koydugu constructora
  DEFAULT CONSTRUCTOR denşir ve bu constructor gorunmez

  classda constructorı gorunur hale getirmek istersek DEFAULT CONSTRUCTOR ile ayni gorevi yapan bir constructor olusturabiliriz
  veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin farkli ozelliklerde constructorlar da
  olusturabiliriz

  constructorlari birbirinden farklilastiran tek ayricalik kullanilan parametre sayisi ve parametre  data turudur

  */

    public Araba() {//3.satir
        System.out.println("parametresin conc calisti ");//4.satir
    }//5 bu satirin sonundan arabaRunner a gidecek

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil , String renk){
        System.out.println(yil + " model " + renk + " renkli bir araba uretildi " );

    }



    //bir kod blogunun method veya cons olmasindan emin olmak icin
    //iki seye dikkat edilmeli
    // 1- Conslarin ismi class ismi ile ayni olmak zorundadir, yani buyuk harfle baslar
    // 2-  conslarin return type i olmaz, return type varsa methoddur
    // ozetle consun adi class adi ile ayni olmali ve return type olmamali



}
