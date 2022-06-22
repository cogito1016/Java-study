package run;

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Apple a1 = new Apple("400", Color.GREEN);
        Apple a2 = new Apple("200", Color.RED);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(a1);
        inventory.add(a2);

//        inventory.sort((Apple firstApple, Apple secondApple)-> firstApple.getWeight().compareTo(secondApple.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight));

        Apple.printApples(inventory);
    }
}
