package run;

import entity.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class AppleWeightSortTest {
    public static void sortUsedCollectionsSort(List<Apple> apples){
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }

    public static void sortUsedJava8(List<Apple> apples){
        apples.sort(Comparator.comparing(Apple::getWeight));
    }

    public static void main(String[] args) {
        Apple lowWeightApple = new Apple("100");
        Apple highWeightApple = new Apple("200");

        List<Apple> apples = new ArrayList<>();
        apples.add(highWeightApple);
        apples.add(lowWeightApple);

        Apple.printApples(apples);

//        sortUsedCollectionsSort(apples);
        sortUsedJava8(apples);

        Apple.printApples(apples);
    }
}
