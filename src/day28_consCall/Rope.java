package day28_consCall;

public class Rope {
    public static void swing(){
        System.out.print("Swing");
    }
    public void climb(){
        System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb(); static olmadigindan gelmez altini kirmizi cizer
    }
    public static void main(String[] args){
        Rope rope=new Rope();
        rope.play();
        Rope rope2=null;
        play();

    }
}
