package run;

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

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

    public static void example_3(){
        ToIntFunction<String> stringToInt = (String s)->Integer.parseInt(s);
        ToIntFunction<String> stringToInt_ = Integer::parseInt;

        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element); //첫째 인수(List형식)의 contains메서드 호출
        BiPredicate<List<String>, String> contains_ = List::contains;

//        Predicate<String> startsWithNumber = (String string) -> this.startsWithNumber(string); //비공개 헬퍼 메서드호출
//        Predicate<String> startsWithNumber_ = this::startsWithNumber;
    }

    public static void example_4(){
        List<String> weights = Arrays.asList("7", "3", "4", "10");
        List<Apple> apples = map(weights, (String weight)-> new Apple(weight));

        Apple.printApples(apples);
    }

    public static List<Apple> map(List<String> weights, Function<String, Apple> function){
        List<Apple> apples = new ArrayList<>();

        for(String weight : weights){
            apples.add(function.apply(weight));
        }

        return apples;
    }


    public static void main(String[] args) {
//        example_1();
//        example_2();
        example_4();
    }
}
