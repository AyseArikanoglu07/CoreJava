package day15_methodCreation;
public class C07_methodCreation {
    public static void main(String[] args) {

        //main methodu olmayan class run edilemez,Java main siz calismaz
        String str="Ali";
        //stringi yazdiran method olusturalim
        stringYazdir(str);
        //hosgeldiniz diyen bir method olusturun
        hosgeldinYazdir();
        //kapanmaMesaji yazan bir method olusturalim
        kapanmaMethodu();
        hosgeldinYazdir();
        stringYazdir("Java gun gectikce guzellesiyor");
        kapanmaMethodu();
    }
   public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.");
    }
    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("Boyle de olur");
    }
    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
