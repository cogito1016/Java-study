package run;

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppleTest2 {

    public static void getSortedList_1(List<Apple> list){
        Collections.sort(list, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }

    public static void getSortedList_2(List<Apple> list, Comparator comparator){
        Collections.sort(list, comparator);
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("5", Color.GREEN);
        Apple a2 = new Apple("1",Color.RED);
        Apple a3 = new Apple("3", Color.GREEN);
        Apple a4 = new Apple("2", Color.RED);

        List<Apple> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        Apple.printApples(list);

//        getSortedList_1(list);
        getSortedList_2(list, new Comparator() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        Apple.printApples(list);
    }
}
