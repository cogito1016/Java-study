package run;

import java.util.Arrays;

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

    public static int maxNuumberUsingReduce(int[] numbers){
        return Arrays.stream(numbers).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
    }

    public static int minNuumberUsingReduce(int[] numbers){
        return Arrays.stream(numbers).reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int result = 0;

//        result = beforeReduce_1(numbers);
//        result = afterReduce_1(numbers);
//        result = afterReduce_2(numbers);
//        result = maxNuumberUsingReduce(numbers);
        result = minNuumberUsingReduce(numbers);

        System.out.println(result);
    }
}
