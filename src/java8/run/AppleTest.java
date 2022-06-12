package run;

import applePredicate.AppleFancyFormatter;
import applePredicate.AppleGreenColorPredicate;
import applePredicate.AppleHeavyWeightPredicate;
import applePredicate.ApplePredicate;
import applePredicate.AppleSimpleFormatter;
import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static List<Apple> filterGreenApples(List<Apple> apples){
        List<Apple> greenApples = new ArrayList<>();

        for(Apple apple : apples){
            if(Color.GREEN.equals(apple.getColor())){
                greenApples.add(apple);
            }
        }

        return greenApples;
    }

    public static List<Apple> filterApplesByColor(List<Apple> apples, Color color){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> apples, String weight){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){
            if(weight.equals(apple.getWeight())){
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApplesByColorOrWeight(List<Apple> apples, Color color, String weight){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){
            if(color!=null){
                if(color.equals(apple.getColor())){
                    result.add(apple);
                }
            }else{
                if(weight.equals(apple.getWeight())){
                    result.add(apple);
                }
            }
        }

        return result;
    }

    public static List<Apple> filterApplesByPredicate(List<Apple> apples, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple redApple = new Apple("100", Color.RED);
        Apple greenApple = new Apple("200", Color.GREEN);
        Apple greenApple2 = new Apple("300", Color.GREEN);
        List<Apple> newApples = new ArrayList<>();

        apples.add(redApple);
        apples.add(greenApple);
        apples.add(greenApple2);

//        Apple.printApples(apples);
//        Apple.prettyPrintApple(apples, new AppleSimpleFormatter());
        Apple.prettyPrintApple(apples, new AppleFancyFormatter());

//        newApples = filterGreenApples(apples);
//        newApples = filterApplesByColor(apples, enums.Color.RED);
//        newApples = filterApplesByWeight(apples, "200");

//        newApples = filterApplesByColorOrWeight(apples, enums.Color.RED,"");
//        newApples = filterApplesByColorOrWeight(apples, null,"200");

//        newApples = filterApplesByPredicate(apples, new AppleGreenColorPredicate());
//        newApples = filterApplesByPredicate(apples, new AppleHeavyWeightPredicate());
        newApples = filterApplesByPredicate(apples, (Apple apple)-> Color.RED.equals(apple.getColor()));


//        Apple.printApples(newApples);
//        Apple.prettyPrintApple(newApples, new AppleSimpleFormatter());
        Apple.prettyPrintApple(newApples, new AppleFancyFormatter());
    }
}
