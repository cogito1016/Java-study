import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Apple{
    private String weight;

    public Apple(String weight){
        this.weight = weight;
    }

    public String getWeight(){
        return weight;
    }
}

public class AppleWeightSortTest {

    public static void printApples(List<Apple> apples){
        System.out.println("Print Apple");
        apples.stream().forEach((Apple apple)->{
            System.out.println(apple.getWeight());
        });
    }

    public static void sortUsedCollectionsSort(List<Apple> apples){
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }

    public static void main(String[] args) {
        Apple lowWeightApple = new Apple("100");
        Apple highWeightApple = new Apple("200");

        List<Apple> apples = new ArrayList<>();
        apples.add(highWeightApple);
        apples.add(lowWeightApple);

        printApples(apples);

        sortUsedCollectionsSort(apples);

        printApples(apples);
    }
}
