package run;

import Boxing.IntPredicate;

import java.util.function.Predicate;

public class IntPredicateTest {
    public static void main(String[] args) {

        IntPredicate eventNumbers = (int i) -> i % 2 == 0;
        eventNumbers.test(1000); // No Unboxing

        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 0;
        oddNumbers.test(1000); // Unboxing

    }
}
