package day12_StringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanim=cumle.indexOf(kelime);//-1 veya index verir
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==(-1))
        {
            System.out.println("Girilen kelime cumlede kullanilmamis.");

        }else if (ikinciKullanim==(-1))
        {
            System.out.println("Girilen kelime cumlede  1 kere kullanilmis.");

        }else
        {
            System.out.println("Girilen kelime cumlede hic kullanilmamis.");
        }


    }
}
