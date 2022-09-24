package run;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PythagoreanTriples {
    public static void main(String[] args) {
        Stream<int[]> py = IntStream.rangeClosed(1,100).boxed()
                .flatMap(
                        a->IntStream.rangeClosed(a,100)
                                .filter(b->Math.sqrt(a*a+b*b)%1==0)
                                .mapToObj(b->
                                        new int[]{a,b,(int)Math.sqrt(a*a+b*b)}));

        py.forEach(t-> System.out.println(t[0]+" "+t[1]+" "+t[2]));
    }
}
