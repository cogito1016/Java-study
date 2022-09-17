package run;

import entity.Trader;
import entity.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTest {

    public static void problem_1(List<Transaction> transactions){
        //2011년에 일어난 모든 트랜잭션을 찾아 오름차순 정렬

        List<Transaction> result =  transactions.stream()
                .filter((Transaction a)->a.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void problem_2(List<Transaction> transactions){
        //거래자가 근무하는 모든 도시를 중복없이 나열
        List<String> result =
                transactions.stream()
                        .map((element)->element.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void problem_3(List<Transaction> transactions){
        //케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬
        List<Trader> result =
                transactions.stream()
                        .map((element)->element.getTrader())
                        .filter((element)->element.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName))
                        .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void problem_4(List<Transaction> transactions){
        //모든 거래자의 이름을 알파베순으로 정렬해서 반환
        List<Trader> result =
                transactions.stream()
                        .map((element)->element.getTrader())
                        .sorted(Comparator.comparing(Trader::getName))
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void problem_5(List<Transaction> transactions){
        //밀라노에 거래자있니

        boolean result = transactions.stream()
                .map((element)->element.getTrader())
                .anyMatch((element)->element.getCity().equals("Milan"));

        System.out.println(result);
    }

    public static void problem_6(List<Transaction> transactions){
        //케임브리지에 거주하는 거래자의 모든 트랜잭션 값
        List<Integer> result = transactions.stream()
                .filter((element)->element.getTrader().getCity().equals("Cambridge"))
                .map((element)->element.getValue())
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void problem_7(List<Transaction> transactions){
        //전체 트랜잭션 중 최댓값
        Integer result = transactions.stream()
                .map((element)->element.getValue())
                .reduce(Integer::max)
                .get();

        System.out.println(result);
    }

    public static void problem_8(List<Transaction> transactions){
        //전체 트랜잭션 중 최소값
        Integer result = transactions.stream()
                .map((element)->element.getValue())
                .reduce(Integer::min)
                .get();

        System.out.println(result);
    }

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
          new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950)
        );

//        problem_1(transactions);
//        problem_2(transactions);
//        problem_3(transactions);
//        problem_4(transactions);
//        problem_5(transactions);
//        problem_6(transactions);
//        problem_7(transactions);
        problem_8(transactions);
    }
}
