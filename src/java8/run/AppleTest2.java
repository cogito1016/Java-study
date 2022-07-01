package run;

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppleTest2 {
    public static void main(String[] args) {
        Apple a1 = new Apple("100", Color.GREEN);
        Apple a2 = new Apple("200",Color.RED);
        Apple a3 = new Apple("50", Color.GREEN);

        List<Apple> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        Apple.printApples(list);

        Collections.sort(list, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        Apple.printApples(list);
    }
}