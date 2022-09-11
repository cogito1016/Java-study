package run;

public class Reduce_1 {

    public static int  beforeReduce_1(int[] numbers){
        int sum = 0;

        for(int x : numbers){
            sum += x;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(beforeReduce_1(numbers));
    }
}
