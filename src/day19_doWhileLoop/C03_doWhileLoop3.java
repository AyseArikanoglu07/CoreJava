package day19_doWhileLoop;

public class C03_doWhileLoop3 {
    public static void main(String[] args) {
        int input=3;

        int sayi=1;


        while (sayi<input){
            System.out.println(sayi);

            sayi++;

        }
        //ayni soruyu do-WhileLoop ile

        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
            }
        while (sayi<input);

    }
}
