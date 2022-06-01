package day28_consCall;

public class MyCons{
    int x=3;
    int y=5;
    MyCons(){
        x+=1;
        System.out.println("-x"+x);
    }
    MyCons(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-x"+x);
    }

    MyCons(int i, int i2) {
        this(3);
        this.x-=4;
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        MyCons mc1=new MyCons(4,3);
    }

}