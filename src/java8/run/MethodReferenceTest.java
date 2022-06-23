package run;

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest {
    public static void example_1(){
        Apple a1 = new Apple("400", Color.GREEN);
        Apple a2 = new Apple("200", Color.RED);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(a1);
        inventory.add(a2);

//        inventory.sort((Apple firstApple, Apple secondApple)-> firstApple.getWeight().compareTo(secondApple.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight));

        Apple.printApples(inventory);
    }

    public static void example_2(){
        List<String> str = Arrays.asList("a","b","c","d");
//        str.sort((s1, s2)->s1.compareToIgnoreCase(s2));
        str.sort(String::compareToIgnoreCase);

        for(String s : str){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
//        example_1();
        example_2();
    }
}
