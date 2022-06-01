package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;

public class C02_FileInputStream {

    /*
    Bir kod yazilirken olasi exceptionlar ongorulup exception olustugunda
    javanin ne yapmasini istedigimizi belirtmeliyiz
    1-Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
    method isminin yanina olusabilecek exceptionu deklare edebiliriz
    2-Eger exception olussa da kodun calismaya devam etmesini istiyorsak
    sorun olusturabilecek kodu try catch blogunun icine alir try bloguna sorun
    cikabilecek kodu catch bloguna olusabilecek exceptionu ve olasi exception durumunda
    javanin neyapmasini istedigimizi yazabiliriz

     */


    public static void main(String[] args) throws FileNotFoundException {//throws FileNotFoundException yazar ve exception fırlatabilir bilgisini veriyor
        String dosyaYolu="src/day41_Exception/dosya";//dosya yolunda degisiklik yaparsan exception firlatir
                                                     // ve kodun calismasini durdurur
        //FileInputStream fis=new FileInputStream(dosyaYolu);


        //kodun durmasini istemezsek;
        try{
            FileInputStream fis = new FileInputStream(dosyaYolu);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}
