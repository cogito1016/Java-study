package run;

import java.util.Arrays;
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
        result = minNuumberUsingReduce(numbers).getAsInt();

        System.out.println(result);
    }
}
