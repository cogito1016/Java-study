package run;

//실행어라운드
//함수 디스크럽터 시그니처
//@FunctionalInteface
//동작파라미터화
//Predicate
//Consumer
//Functiton

import entity.Apple;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Repeat_220617 {

    public static <T,R> List<R> apply(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();

        for(T t : list){
            result.add(function.apply(t));
        }//for end

        return  result;
    }//apply end

    public static <T> void prettyPrint(List<T> list){
        System.out.println("Print PrettyPrint ----");
        for(T t : list){
            System.out.println(t.toString());
        }//for end
    }//for end

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("100", Color.GREEN));
        apples.add(new Apple("200", Color.RED));
        apples.add(new Apple("300", Color.GREEN));
        apples.add(new Apple("400", Color.RED));
        prettyPrint(apples);

        List<String> applesWeight = apply(apples,(Apple a)->a.getWeight());
        prettyPrint(applesWeight);
    }
}
