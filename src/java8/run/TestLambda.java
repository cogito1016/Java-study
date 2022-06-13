package run;

import entity.Apple;

import java.util.Comparator;

public class TestLambda {
    public static void main(String[] args) {

        Comparator<Apple> byWeight = new Comparator<Apple>(){
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        Comparator<Apple> byWeightUsedLambda = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
        

    }
}
