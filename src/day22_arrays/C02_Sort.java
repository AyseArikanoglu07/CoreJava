package day22_arrays;

public class C02_Sort {
    public static void main(String[] args) {
        int arr[]={3,5,6,1,9,45,25,4,9};

        //sort methodu olmadan yaparsak

        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];

            }
            if (arr[i]>enBuyukSayi);

        }
    }
}
