package day02_Variables;

public class C_Hatirlatmalar {
    public static void main(String[] args) {


        //2.Gun 1.ders
        // bir variable olustururken icerisine koyacagim datanin alablecegi degerlere uygun
        // bir data turu secmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak variable'imizin
        // data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunı icine alabilecek buyuklukte bir data turu secilebilir
        // kurs boyunca genelde tamsayilar icin int, ondalikli sayilar icin double kullanacagiz
        //float en az kullanilan data turudur

        //2.Gun 2.ders
        //bir variable deklare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak deklare edilen bir variable tekrar deklare edilemez.
        //ikinci kez String data türünde ogrenci ismi  deklare edilemez java kabul etmez
        //deger degisir degisken degişmez
        // String ogrenciIsmi="Abdullah";

        //2.Gun 3.Ders
        // String non-primitive oldugu icin biz sadece data saklamiyor ekstra bazi ozellikleri de kullanabiliyoruz
        // Tc No, okul no , Tel no gibi kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin de String kullanilabilir

        // bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir

        //Java calismaya main methoddan baslar
        //Sonra yukaridan asagiya, soldan saga calisir
        //eger istersek bir variable' i once deklare edip sonra deger atayabiliriz

        String OkulIsmi = "yildiz koleji";

        //Java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        //Ancak deger atamasi yapincaya kadar o variabl' i kullanmamiza izin vermez

        System.out.println(OkulIsmi);

        OkulIsmi = "star koleji";
        System.out.println(OkulIsmi);

        OkulIsmi= "Java Koleji";
        System.out.println(OkulIsmi);

        //java son degeri gorur ve yazar


    }

}
