import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppleTest {

    public static List<Apple> filterGreenApples(List<Apple> apples){
        List<Apple> greenApples = new ArrayList<>();

        for(Apple apple : apples){
            if(Color.GREEN.equals(apple.getColor())){
                greenApples.add(apple);
            }
        }

        return greenApples;
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        Apple redApple = new Apple("100",Color.RED);
        Apple greenApple = new Apple("200",Color.GREEN);
        Apple greenApple2 = new Apple("300",Color.GREEN);
        List<Apple> greens = new ArrayList<>();

        apples.add(redApple);
        apples.add(greenApple);
        apples.add(greenApple2);

        Apple.printApples(apples);

        greens = filterGreenApples(apples);

        Apple.printApples(greens);
    }
}
