package day07_ifElseStatements;

public class C02_ifStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b && b < 100) {
            System.out.println("isleminiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");

        }

        if (a < 0) System.out.println("suslu parantez olmazsa sadce bir satir calisir");
        //if cumlesi noktali virgulde biter, susulu parantez yok cunku
        //bir if cumlesinin daha anlasilir olmasini istersek if body sini {} icine yazmaliyiz
        //body yi {} icine yazmazsak if cumlesi ilk noktali virgulde biter

        System.out.println("2.satir calisti");
        //19.cumle 14 deki if true olsa da false olsa da calisir
        //bu cumle ife bagli degildir

        if (a < b && b < 100) {
            System.out.println("isleminiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }


    }
}