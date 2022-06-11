package applePredicate;

import entity.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return Integer.parseInt(apple.getWeight())>150;
    }
}
