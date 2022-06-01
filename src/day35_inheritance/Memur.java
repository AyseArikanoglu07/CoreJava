package day35_inheritance;

public class Memur extends Personel{
    public static void main(String[] args) {

        //objeleri kendi klsimizda olusturlim
        //ama parent classin ozelliklerini kullanarak donatabilelim

        Memur objMemur=new Memur();
        objMemur.isim="Faruk";
        objMemur.soyisim="Yilmaz";
        objMemur.adres="Antalya";

    }
}
