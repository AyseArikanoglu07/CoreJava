package day29_StaticKeyword;

public class C02 {public static void main(String[] args) {
    // baska class'daki static class uyelerine
    // ulasabilmek icin sadece clasIsmi.staticUyeIsmi
    // yazmamiz yeterlidir
    System.out.println(C01.okulTelefonu); // 3122563635
    C01.okulTelefonu="3125474747";
    System.out.println(C01.okulTelefonu); // 3125474747
    // Baska class'daki static olamayan class uyelerine
    // ancak o class'dan obje olusturarak ulasabiliriz
    // ve obje ile yapilan atamalar sadece o obje icin gecerli olur
    C01 obj1=new C01();
    C01 obj2=new C01();
    System.out.println(obj2.okulIsmi); // Yildiz koleji
    obj2.okulIsmi="Sabir koleji";
    System.out.println(obj1.okulIsmi); // Yildiz koleji
}
}
