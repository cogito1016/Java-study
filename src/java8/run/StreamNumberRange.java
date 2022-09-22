package run;

import java.util.stream.IntStream;

public class StreamNumberRange {
    public static void main(String[] args) {
        long evenNumber = IntStream.rangeClosed(1,100)
                .filter((element)->element%2==0)
                .count();

        System.out.println(evenNumber);
    }
}
