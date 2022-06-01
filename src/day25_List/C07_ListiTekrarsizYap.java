package day25_List;

import java.util.ArrayList;
import java.util.List;

public class C07_ListiTekrarsizYap {
    public static void main(String[] args) {
        //verilen listede tekrar eden sayilari sadece 1 kere yapan method olusturun

        List<Integer> sayilarList=new ArrayList<Integer>();

        sayilarList.add(1);
        sayilarList.add(3);
        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(5);
        sayilarList.add(6);
        sayilarList.add(1);
        sayilarList.add(7);

        sayilarList=tekrarsizListeOlustur(sayilarList);


    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayilarList) {
        List<Integer> tekrarsizList = new ArrayList<Integer>();

        for (int i = 0; i < sayilarList.size(); i++) {
            if (!tekrarsizList.contains(sayilarList.get(i))) {
                tekrarsizList.add(sayilarList.get(i));
            }
        }
        return tekrarsizList;
    }


    }
