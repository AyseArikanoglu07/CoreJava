package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k=0;
            while((k=fis.read()) !=1)//dosyalari okumak icin kalip kod
                System.out.println((char)k);//okuma problemi olabileceginde bir catch blogu daha eklenmesini ister
        } catch (FileNotFoundException e) {//exception firlattiğinda yazdiği yazilari yazar ama durmaz calismaya devam eder
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Exceptionlar icin de parent-child iliskisi mevcuttur.
        bir kod icin birden fazla exception olusma ihtimali varsa
        oncelkle olasi exceptionlar parent child iliskisi bakmamiz gerekir
        parent child iliskisi yoksa istedigimiz sirada catch cumleleri olusturabiliriz


       ELEK;
       parent classlar daha kapsayicidir dha cok hata yakalar, delikleri ince elekler gibidir,
       catch blogunda parent classi uste koyarsan child classlar in exception icin yapabilecegi bisey olmaz
         */

    }
}
