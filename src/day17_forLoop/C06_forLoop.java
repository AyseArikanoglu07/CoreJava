package day17_forLoop;

public class C06_forLoop {
    public static void main(String[] args) {

        char harf1='D';
        char harf2='K';

        for (char i = harf1; i <=harf2 ; i++) {
            System.out.print(i+" ");

        }

        double baslangic=10;
        double bitis=11;
        double artis=0.2;

        for (double i = baslangic; i <=bitis ; i+=artis) {

            System.out.println(i+" ");

        }



    }
}
