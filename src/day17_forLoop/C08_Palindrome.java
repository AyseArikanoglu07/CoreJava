package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        //kullanicinin girdigi string palindrome mudur kontrol eden bir method yazin
              
        //once girilen degeri tersine cevirdiginde  her iki deger 
        // birbirine esitse palindrome olur

        String input="74047";
        palindromeKontrolEt(input);
        
    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i =input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);


        }

        System.out.println("inputun tersten yazilisi :" + terstenInput);

        if(input.equalsIgnoreCase(terstenInput))
        {
        System.out.println("input palindrome dur");
        }
        else System.out.println("input palindrome degildir");
}
}
