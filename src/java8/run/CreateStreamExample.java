package run;

import java.util.stream.Stream;

public class CreateStreamExample {

    public static void createValueStream(){
        Stream<String> stream = Stream.of("Java", "Python", "Javascript");
        stream.map(String::toUpperCase).forEach((element)-> System.out.println(element));
    }

    public static void main(String[] args) {
        createValueStream();
    }
}
