package day27_constructor;

public class Zort {
    String isim;
    String soyIsim;
    int no;
    boolean gercekMi;


    public Zort(String ism, String soyism, int no, boolean grc) {
        isim=ism;
        soyIsim=soyism;
        no=no;
        gercekMi=grc;

        }

    public Zort(String isim, String soyisim, int no) {
        this.isim=isim;
        this.soyIsim=soyisim;
        this.no=no;

    }

    public String toString(){
        return("Isim: " + isim + ", " + "Soyisim: " + soyIsim + ", no:" + no);
        }
}
