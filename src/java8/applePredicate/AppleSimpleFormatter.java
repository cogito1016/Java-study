package applePredicate;

import entity.Apple;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        return "Apple weight : "+apple.getWeight()+" Color : "+apple.getColor();
    }
}
