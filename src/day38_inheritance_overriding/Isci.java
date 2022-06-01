package day38_inheritance_overriding;

public class Isci extends Personel{

    public String statu="Isci";
    public String Hklar="isciler kidem tazminati alirlar";
    public String ikramiye="isciler yilda 2 kez ikramiye alirlar";
    public void mesai(){
        System.out.println("tum isciler haftalik 40 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("tum isciler 30gun*8 saat*11 euro= " +(30*8*11));
    }
}
