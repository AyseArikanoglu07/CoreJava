package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        int input=5;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            //ücgen sekli yapmak icin inner loopun end pointer ını outer loop un degiskeni olarak belirleriz
            System.out.println("");

        }
    }
}
