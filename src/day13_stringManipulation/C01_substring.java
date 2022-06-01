package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));
        //yukarıdaki stringi mehmet hoca ile IT cok guzel yapalim

        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));
        System.out.println(str.substring(9));//yazilan index inclusive


        System.out.println(str.substring(0,5));//baslangic indexi inclusive(dahil)
                                               //bitis index, exclusive(haric)
        System.out.println(str.substring(0,1));

        //6.harfi(0 ile basladigindan 5.index) string olarak bulun

        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//7.index dahil, 7.index hariç
        //System.out.println(str.substring(5,2));bitis indexi baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir
        System.out.println(str.substring(str.length()-5));//son 5 harfi yazdirir
        System.out.println(str.substring(str.length()));//son harften sonraki kismi yani hiclik verir











    }

}
