package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void collectionProcess_1(List<Dish> menu){
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

    public static void collectionProcess_2(List<Dish> menu){
        List<String> lowCaloricDishesName =
                menu.stream()
                        .filter(d->d.getCalories() < 400)
                        .sorted(Comparator.comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .collect(Collectors.toList());

        for(String name : lowCaloricDishesName){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();
        Dish dish1 = new Dish(100,"Ham");
        Dish dish2 = new Dish(500,"Cal");
        menu.add(dish1);
        menu.add(dish2);

//        collectionProcess_1(menu);
        collectionProcess_2(menu);
    }
}
