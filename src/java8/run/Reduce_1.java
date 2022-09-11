package run;

import entity.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Reduce_1 {

    public static int  beforeReduce_1(int[] numbers){
        int sum = 0;

        for(int x : numbers){
            sum += x;
        }

        return sum;
    }

    public static int afterReduce_1(int[] numbers){
        return Arrays.stream(numbers).reduce(0, (a,b)->a+b);
    }

    public static int afterReduce_2(int[] numbers){
        return Arrays.stream(numbers).reduce(0,Integer::sum);
    }

    public static OptionalInt maxNuumberUsingReduce(int[] numbers){
//        return Arrays.stream(numbers).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        return Arrays.stream(numbers).reduce(Integer::max);
    }

    public static OptionalInt minNuumberUsingReduce(int[] numbers){
//        return Arrays.stream(numbers).reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        return Arrays.stream(numbers).reduce(Integer::min);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int result = 0;

//        result = beforeReduce_1(numbers);
//        result = afterReduce_1(numbers);
//        result = afterReduce_2(numbers);
//        result = maxNuumberUsingReduce(numbers);
//        result = minNuumberUsingReduce(numbers).getAsInt();

//        System.out.println(result);

        Dish d0 = new Dish("d0",false,100, Dish.Type.FISH);
        Dish d1 = new Dish("d1",false,100, Dish.Type.FISH);
        Dish d2 = new Dish("d2",false,100, Dish.Type.FISH);
        Dish d3 = new Dish("d3",false,100, Dish.Type.FISH);
        Dish d4 = new Dish("d4",false,100, Dish.Type.FISH);

        List<Dish> dishes = Arrays.asList(d0,d1,d2,d3,d4);

//        Long result_example = dishes.stream()
//                        .count();
        int result_example = dishes.stream()
                .map((element)->1)
                        .reduce(Integer::sum)
                                .get();

        System.out.println(result_example);
    }
}
