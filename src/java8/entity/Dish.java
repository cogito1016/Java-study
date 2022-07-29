package entity;

import java.util.ArrayList;

public class Dish {
    private int calories;
    private String name;

    public Dish(int calories, String name){
        this.calories = calories;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public static void printDishList(ArrayList<Dish> dishes){
        System.out.println("-----------------------");
        for(Dish dish : dishes){
            System.out.println("Name : " + dish.name + " Calories : " + dish.getCalories());
        }
    }
}
