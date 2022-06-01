package day23_arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        //verilen multidimensional arrayin tum elementlerinin toplamini bulunuz
        int arr[][]={{3,1,7},{6,10,2}};

        //her zaman değişkenleri koymak için bir konteynır olusturmaliyiz
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];


            }

        }
        System.out.println("arraydeki elementlerin toplami : " + toplam);
        //1.inner ve 2.innerın element sayisi aynı olmasa da calisir

    }

}
