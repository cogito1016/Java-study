package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamVariation {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("Fish",false,100, Dish.Type.FISH),
                new Dish("Dog",false,500, Dish.Type.MEAT)
        );

        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println(calories);
    }
}
