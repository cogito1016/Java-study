package run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {


    public static <T> List<T> filterByBranch(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<T>();

        for(T t : list){
            if(predicate.test(t)){
                result.add(t);
            }//if end
        }//for end

        return result;
    }//filterBybranch() end

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("Hello");
        list.add("");
        list.add("World");

        // Signature(Function Descriptor) T -> boolean
        List<String> result = filterByBranch(list, (String s) -> !s.isEmpty());
        System.out.println(result.size());
        for(String s : result){
            System.out.println(s);
        }
    }
}
