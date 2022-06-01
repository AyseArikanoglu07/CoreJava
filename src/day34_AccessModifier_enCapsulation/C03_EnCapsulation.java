package day34_AccessModifier_enCapsulation;

public class C03_EnCapsulation {
 //burada encapsule edecegimiz iki variable olsun

private int sayi;
private String str;

 public int getSayi() {//okur
  return sayi;
 }//getter ve setter methodlari
                                      // biraraya gelince public
                                      //gibi olur ozelligi

 public String getStr() {//okur
  return str;
 }//getter sadece okuybilir
                                       // setter degisiklik yapabilir

 @Override
 public String toString() {
  return "C03_EnCapsulation{" +
          "sayi=" + sayi +
          ", str='" + str + '\'' +
          '}';
 }

 public void setStr(String str) {//yazar,instance variable
  this.str = str;//instance variable

 }
}
