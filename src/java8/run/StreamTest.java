package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        Dish dish1 = new Dish(100,"Ham");
        Dish dish2 = new Dish(500,"Cal");
        menu.add(dish1);
        menu.add(dish2);

        ArrayList<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish : menu){
            if(dish.getCalories() < 400){
                lowCaloricDishes.add(dish);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(), o2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish dish: lowCaloricDishes){
            lowCaloricDishesName.add(dish.getName());
        }

        Dish.printDishList(lowCaloricDishes);
    }
}
