package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Dish> menu = new ArrayList<>();

        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish : menu){
            if(dish.getCalories() < 400){
                lowCaloricDishes.add(dish);
            }
        }

    }
}
