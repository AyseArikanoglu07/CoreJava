package day27_constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();

        //parametreli bir cons olusturdugunda
        //yapilan diger islemlerin bozulmamasi icin
        //bir de parametresiz cons olusturulmali
    }
    public Volvo(){//parametresiz cons

    }

    public int maxHizAta() {
        int maxHiz = 0;
        if (elektrikliMi) {
            maxHiz = 160;
        } else {
            maxHiz = 280;
        }
        return maxHiz;
    }

        public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if (elektrikliMi){
            sonuc=true;
        }else {
            sonuc=false;
        }
        return sonuc;

    }
    public String toString(){
        String arabaOzellikleri="model: " + model +
                                " yakit: " + yakit +
                                " max hiz: " + maxHiz ;




        return arabaOzellikleri;

    }

    }



