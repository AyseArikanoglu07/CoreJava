package day36_Inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }

    public static void main(String[] args) {


       //1.adim
        Memur memur1 =new Memur();

         //memur1 objesi memur clasının objesi olmasina ragmen
         //inherit ettigi muhasebe ve onun da parentı olan
         //personel claslarındaki tum datalari alır


        //personel classından
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Okur";
        memur1.adres="Ankara";
        memur1.telNo="3125756595";

        //muhasebe classindan
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);


        }
}
