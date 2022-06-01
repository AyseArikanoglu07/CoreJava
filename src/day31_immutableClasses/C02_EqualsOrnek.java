package day31_immutableClasses;

public class C02_EqualsOrnek {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        String b = "2cfalse";

        if (a == "2cfalse") {//String a her seferinde degistigi icin Strng havuzundan karsilastirilamaz,
            // bisey yazmaz ekrana
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        if (b == "2cfalse") {//string b olusturuldugunda gorur ve yazar
            System.out.println("==");

        }
        if (b.equals("2cfalse")) {
            System.out.println("equals");

        }
    }
}