package run;

import entity.Dish;
import enums.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
                menu.stream() //stream()을 parallelStream()으로 바꾸면 이 코드를 멀티코어 아키텍처에서 병렬로 실행 가능
                        .filter(d->d.getCalories() < 400)
                        .sorted(Comparator.comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .collect(Collectors.toList());

        for(String name : lowCaloricDishesName){
            System.out.println(name);
        }
    }

    public static  void stream_example_1(List<Dish> menu){
        List<String> threeHighCaloricDishNames =
                menu.stream()
                        .filter(dish -> dish.getCalories() > 300)
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(threeHighCaloricDishNames);
    }

    public static void stream_example_2_collection(List<Dish> menu){
        List<String> highCaloricDishes = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while(iterator.hasNext()){
            Dish dish = iterator.next();
            if(dish.getCalories() > 300){
                highCaloricDishes.add(dish.getName());
            }
        }

        System.out.println(highCaloricDishes);
    }

    public static void stream_example_2_stream(List<Dish> menu){
        List<String> highCaloricDishes =
                menu.stream()
                        .filter(dish -> {
                            System.out.println("Caloric: "+ dish.getCalories());
                            return dish.getCalories() > 300;
                        })
                        .map(dish -> {
                                System.out.println("Name: "+ dish.getName());
                                return dish.getName();
                        })
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(highCaloricDishes);
    }

    public static void stream_example_3(List<Dish> menu){
        List<Dish> filteredMenu =
                menu.stream()
                        .filter(dish -> dish.getCalories() < 320)
                        .collect(Collectors.toList());
        System.out.println(filteredMenu);
    }

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

//        collectionProcess_1(menu);
//        collectionProcess_2(menu);
//        stream_example_1(menu);
//        stream_example_2_collection(menu);
//        stream_example_2_stream(menu);
        stream_example_3(menu);
    }
}
