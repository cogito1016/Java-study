package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamVariation {

    public static void stream_ex_1(List<Dish> menu){
        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println(calories);
    }

    public static void stream_ex_2(List<Dish> menu){
        IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();

        stream.forEach((element)-> System.out.println(element.toString()));
    }

    public static void stream_ex_3(){
        List<Dish> menu = new ArrayList<>();
        OptionalInt optionalInt = menu.stream().mapToInt(Dish::getCalories).max();
        int max = optionalInt.orElse(1);
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("Fish",false,100, Dish.Type.FISH),
                new Dish("Dog",false,500, Dish.Type.MEAT)
        );

//        stream_ex_1(menu);
//        stream_ex_2(menu);
        stream_ex_3();
    }

}
