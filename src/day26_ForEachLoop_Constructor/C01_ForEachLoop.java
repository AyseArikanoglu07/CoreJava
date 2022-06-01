package day26_ForEachLoop_Constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        //elementleri for loop ile yazdiralim
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+"");

        }
        System.out.println("");
        //bunu for-each loop ile yaparsak
        //for-each loop calistirmak icin hedef bir collection vermeliyiz

        for (int each:arr//arr arrayine git herbir int elementi getir
             ) {
            System.out.print(each+ " ");

        }
        //avantaji: index, baslangic degeri, bitis degeri gibi detaylarla
        // ugrasmamiza gerek kalmadan collections tan tum elementleri getirir
        //dezavantaji indexe bagli islem yapamayiz
    }
}
