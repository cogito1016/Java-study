package run;

import java.util.stream.Stream;

public class CreateStreamExample {

    public static void createValueStream(){
        Stream<String> stream = Stream.of("Java", "Python", "Javascript");
        stream.map(String::toUpperCase).forEach((element)-> System.out.println(element));
    }

    //Null이 될 수 있는 객체를 스트림으로 만들기
    public static void createNullableObjectStream(){
        String s = System.getProperty("home");

        //예전같으면..
        Stream<String> stream = s==null?Stream.empty():Stream.of(s);
    }

    public static void main(String[] args) {
        createValueStream();
    }
}
