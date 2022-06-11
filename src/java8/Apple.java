import java.util.List;

public class Apple {
    private String weight;
    private Color color ;

    public Apple(String weight){
            this.weight = weight;
    }

    public Apple(String weight, Color color){
        this.weight=weight;
        this.color=color;
    }
    public String getWeight(){
            return this.weight;
        }

    public Color getColor(){return this.color;}

    public static void printApples(List<Apple> apples){
        System.out.println("Print Apple");
        apples.stream().forEach((Apple apple)->{
            System.out.println("Weight : "+apple.getWeight()+" Color : "+apple.getColor());
        });
    }
}
