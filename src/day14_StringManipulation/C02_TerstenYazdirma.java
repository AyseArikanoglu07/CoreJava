package day14_StringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //soru5-Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String input="mavi";
        //String tersStr=input.substring(input.length()-1);uzunlugunu bilmesek uygulanabilirdi
        String tersStr=input.substring(3).toLowerCase()+
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();

        System.out.println(tersStr);





    }
}
