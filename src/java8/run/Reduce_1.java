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

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int result = 0;

//        result = beforeReduce_1(numbers);
        result = afterReduce_1(numbers);

        System.out.println(result);
    }
}
