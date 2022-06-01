package day36_Inheritance;

public class SurekliIsciler extends Isci{
    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
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


        SurekliIsciler suric1 = new SurekliIsciler();
        suric1.personelNo=5001;
        suric1.isim="Cem";
        suric1.soyisim="Akay";
        suric1.statu="isci";
        suric1.saatUcreti=11;
        suric1.maas= suric1.maasHesapla();
        System.out.println(suric1);



    }
}
