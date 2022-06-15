package run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static <T> void forEachPrint(List<T> list, Consumer<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }//for end
    }//forEachPrint end

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);

        //T -> void
        forEachPrint(list, (Integer i) -> System.out.println(i) );
    }
}
