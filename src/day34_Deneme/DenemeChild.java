package day34_Deneme;

        import day34_AccessModifier_enCapsulation.C01;

//14.adim
public class DenemeChild extends C01 {
    public static void main(String[] args) {


        //C01 obj = new C01();almadi

        System.out.println(halkaAcik);
        halkaAcik=26;
        System.out.println(halkaAcik);

        //17.adim
        C01.aileyeOzel=25;//baska bir package ta olmama ragmen
                          // access modifier ı protected static old icin ulasabiliyoruz

    }


}
