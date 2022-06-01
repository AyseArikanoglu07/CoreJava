package day36_Inheritance;

public class Ustabasi extends Isci{
    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="ustabasi";

        System.out.println(ustabasi1);

    }
}
