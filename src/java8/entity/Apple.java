package entity;

import applePredicate.AppleFormatter;
import enums.Color;

import java.util.List;

public class Apple {
    private String weight;
    private Color color ;

    public Apple(String weight){
            this.weight = weight;
    }

    public Apple(String weight, Color color){
        this.weight=weight;
        this.color=color;
    }
    public String getWeight(){
            return this.weight;
        }

    public Color getColor(){return this.color;}

    public String toString(){
        return "Weight : "+this.getWeight()+" enums.Color : "+this.getColor();
    }

    public static void printApples(List<Apple> apples){
        System.out.println("Print entity.Apple");
        apples.stream().forEach((Apple apple)->{
            System.out.println(apple.toString());
        });
    }

    public static void prettyPrintApple(List<Apple> apples, AppleFormatter appleFormatter){
        System.out.println("Print --");
        for(Apple apple : apples){
            String result = appleFormatter.accept(apple);
            System.out.println(result);
        }
    }
}
