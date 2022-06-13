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

//        String형식의 파라미터 하나를 가지며 정수형을 반환
//        람다표현식에는 return이 함축된다. (명시하지않아도됨)
//        (String s) -> s.length();

//        Apple형식의 파라미터 하나를 가지며 불리언형을 반환
//        (Apple a) -> a.getWeight() > 150

//        Int형식의 파라미터 두개를 가지며 출력을함, 리턴값이 없음. 여러문장쓰기 가능. 여러문장쓰려면 {}필수
//        (int a, int y) -> {sout("Hellowlrd"); sout(x+y);}

//        파라미터가없으며 정수형 42를 반환
//        () -> 42

//        Apple형식의 파라미터 두개를받으며 정수형을 반환
//        (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWiehgt())

    }
}
