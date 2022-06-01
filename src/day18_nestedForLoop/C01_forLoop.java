package day18_nestedForLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        //10 dan kucuk tam sayi iste faktoryeli bul
        int input=9;//9*8*7*6*5*4*3*2*1
        int faktoryel=1;
        String faktoriyelAcikYazim="";
        for (int i =input; i >=1 ; i--) //inputtan baslayıp 1 ekadar gitmeli eksilterek
        {
            faktoryel *= i;

            if (i==input) {faktoriyelAcikYazim=faktoriyelAcikYazim+i;
            }
            else faktoriyelAcikYazim=faktoriyelAcikYazim+"*"+i;

        }


        //loopun disina yazdirirsan tek satirda gorursun

        System.out.println(input+"! = " + faktoriyelAcikYazim+ "=" +faktoryel);

    }


}
