package day23_arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun
        int arr[]={3,5,7,5,2};
        int eklenecekElement=1;

        arr=arrayeElemanEkle(arr,eklenecekElement);
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[arr.length+1];//[0,0,0,0]


        for (int i = 0; i <arr.length; i++) {
            yeniArray[i]=arr[i];

        }
        yeniArray[yeniArray.length-1]=eklenecekElement;

        return yeniArray;



        }




    }

