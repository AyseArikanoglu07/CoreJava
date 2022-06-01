package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
       //her obje olusturdugumuzda model, yakit gibi degerleri tek tek atama yapmak
       //istemiyorsak;
        Volvo arb1=new Volvo("xc60" , false , 2023 , "benzin" );
        System.out.println(arb1.toString());
        System.out.println(arb1);//to.String methodu olmazsa arb1 in referansini yazdirir
         {
        }
    }
}
