package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> liste=new LinkedList<>();

        liste.add(30);
        liste.add(13);
        System.out.println(liste.peek());
        System.out.println(liste.poll());
        System.out.println(liste.pop());
        liste.push(24);
        System.out.println(liste);


    }
}
