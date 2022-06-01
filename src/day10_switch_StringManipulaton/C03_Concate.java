package day10_switch_StringManipulaton;

public class C03_Concate {
    public static void main(String[] args) {

        //Concatenation yapmak icin iki ihtimal var
        //istersek daha once yaptigimiz gibi + operatorunu

        String str1="Java";
        String str2="Candir";

       //Java Candir yazdiralim
        System.out.println(str1+" "+ str2);

        String cumle=str1.concat(str2); //str 1 i yazdiracak str 2 yi yapiştiracak
        cumle= str1.concat(" ").concat(str2);
        System.out.println( cumle);

        //concat icine str degil de sayi veya boolean deger yazsak ?
        //concat metodu icine str parametre ister
        //str disinda data turu yazarsaniz onu str haline getirmelisiniz


        //cumle= str1.concat(5);
        cumle=str1.concat(""+5);
        //cumle= str1.concat(true);
        cumle=str1.concat(true+"");




    }
}
