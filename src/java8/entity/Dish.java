package entity;

import enums.Type;

import java.util.ArrayList;

public class Dish {
    private final int calories;
    private final String name;
    private final boolean vegetarian;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type){
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString(){
        return name;
    }

    public enum Type { MEAT, FISH, OTHER};

    public static void printDishList(ArrayList<Dish> dishes){
        System.out.println("-----------------------");
        for(Dish dish : dishes){
            System.out.println("Name : " + dish.name + " Calories : " + dish.getCalories());
        }
    }
}
