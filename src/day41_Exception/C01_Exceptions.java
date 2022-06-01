package day41_Exception;

public class C01_Exceptions {

    //Exceptions sorunlarini cozmek icin try-catch blok kullaniriz
    //Try blogu tekbasina calişsmaz,catch blogu bir veya birden cok olabilir
    //Try blogundan sonra mutlaka catch veya finally block olmalidir

    public static void main(String[] args) {
       /* int a=10;
        int b  =5;
        int c=a/b;*/

        int a=10;
        int b=0;
        int c=a/b;//exception verir

        int a1=10;
        int b1=0;
        try {
            int c1=a1/b1;
        } catch (Exception e){//e javanin exceptionı atayacagi objedir, exception olusan exceptionun turu
            e.printStackTrace();

            System.out.println(e.getMessage());//sonucun mnesajini dondurur sadece
            System.out.println(e.getCause());//
        }

        System.out.println(c);


    }

}
