package run;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
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
//        Stream<String> stream = s==null?Stream.empty():Stream.of(s);

        //Java9에서는 아래가 가능
//        Stream<String> stream = Stream.ofNullable(s);

        //활용
//        Stream<String> values = Stream.of("config","home","user")
//                .flatMap(key->Stream.ofNullable(System.getProperty(key)));
    }

    public static void createFileStream(){
        long uniqueWords = 0;

        try(Stream<String> lines =
                    Files.lines(Paths.get("./resource/data.txt"), Charset.defaultCharset())){
            uniqueWords = lines.flatMap(line->Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println("Word COunt : "+uniqueWords);
    }

    public static void createInfinityStrem(){

    }

    public static void practiceIterateMethod(){
        Stream.iterate(0, n->n+2)
                .limit(10)
                .forEach(System.out::println);
    }

    public static void makeArraytoStream(){
        int[] numbers = {1,2,3,4,5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        createValueStream();
//        makeArraytoStream();
        createFileStream();
    }
}
