package day27_constructor;

public class Toyota {
    //objeyi olusturacagimiz class

    String marka="Toyota";
    int lastikAdedi=4;
    boolean motoruVarMi=true;
    String model;//class levelda
    String yakit; // oluısturuldugundan
    int yil;//instance variablelar

    public void maxHiz(){

        if (yakit.equals("Benzin")){
            System.out.println("benzinli araclar max 240km hiz yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araclar max 200km hşiz yapar");
        }
    }
    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla modeli icin renk gumus");
        }else if (model.equals("Yaris ")){
            System.out.println("Yaris modeli icin renk beyaz ");
        }
    }


}
