package run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static <T,R> List<R> apply(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();

        for(T t : list){
            result.add(function.apply(t));
        }//for end

        return result;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Mr");
        strings.add("Kim?");

        //R -> T
        List<Integer> integers = apply(strings, (String s)->s.length());

        for(int i : integers){
            System.out.println(i);
        }//for end
    }
}
