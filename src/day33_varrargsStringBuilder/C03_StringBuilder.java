package day33_varrargsStringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 length : " + sb1.length());
        System.out.println("sb1 cpacity :" + sb1.capacity());

        System.out.println("sb2 length : " + sb2.length());
        System.out.println("sb2 cpacity :" + sb2.capacity());

        System.out.println("sb3 length : " + sb3.length());
        System.out.println("sb3 cpacity :" + sb3.capacity());

        //appent methodu ile string builder a ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println(sb1);
        System.out.println("sb1 length : " + sb1.length());
        System.out.println("sb1 cpacity :" + sb1.capacity());

        sb1.append(3);
        System.out.println(sb1);
        System.out.println("sb1 length : " + sb1.length());
        System.out.println("sb1 cpacity :" + sb1.capacity());//16

        sb1.append(true);
        System.out.println(sb1);
        System.out.println("sb1 length : " + sb1.length());//19
        System.out.println("sb1 cpacity :" + sb1.capacity());//34=16*2+2 son capacity nin 2 katinin 2 fazlasi

        sb1.append(" tum dersler java olsa");
        System.out.println(sb1);
        System.out.println("sb1 length : " + sb1.length());//41
        System.out.println("sb1 cpacity :" + sb1.capacity());//70=34*2+2


        sb1.trimToSize();
        System.out.println("sb1 length : " + sb1.length());
        System.out.println("sb1 cpacity :" + sb1.capacity());//length ve capacitynin bosluklarini siler ve esitler

    }
}
