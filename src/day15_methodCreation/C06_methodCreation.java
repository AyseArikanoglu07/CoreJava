package day15_methodCreation;

public class C06_methodCreation {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        //iki variable ın degerlerini toplayan bir method olusturalim
        //1.adim : method adini yazin
        //2.adim : methoda gondermem gereken argument var mı


     ikiSayiTopla(25,50);
     C04.dortHarfiTersineCevir("sema");

    }

    //main methoddan cıktık yeni methoddayiz

    //bir methodu olusturmak calismasi icin yeterli degildir
    //***method ancak cagirilirsa calisir***
    //

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a+b));

    }
}
