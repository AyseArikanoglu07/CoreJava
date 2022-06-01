package day46_iteratorCollections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem list hem de queue nin childıdır
        LinkedList<Integer>list=new LinkedList<>();
        list.add(5);
        list.add(10);//add methodu listten geldigi icin hep sona ekler
        list.addFirst(11);//add first deque den gelir basa yazar
        list.addLast(23);//dequeden gelir ve sona ekler

        System.out.println(list);
        list.add(2,25);
        System.out.println(list);



    }



}
