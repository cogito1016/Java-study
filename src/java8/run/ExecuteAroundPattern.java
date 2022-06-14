package run;

import processor.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAroundPattern {

    public static String processFile() throws IOException{
        //1.초기화/준비
        //2.작업
        //3.정리/마무리

        //자바 7에 추가된 try-with-resources 구문
        //자원을 명시적으로 닫을필요가 없으므로 간결한 코드구성에 도움을 준다.
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt")); ) {
            return br.readLine(); //실제 작업
        }
    }

    //BufferedReaderProcessor process메서드 시그니처 (BufferedReader -> String)와 일치하는 람다 전달가능
    public static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt")); ){
            return bufferedReaderProcessor.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
        String st = processFile((BufferedReader br)->br.readLine()+br.readLine());
    }
}
