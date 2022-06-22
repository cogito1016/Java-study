package run;

import processor.BufferedReaderProcessor;

import java.io.BufferedReader;

public class ExceptionTest {

    public static void main(String[] args) {

        //예외를 위해
        //함수형 인터페이스에 직접 예외를 선언하거나,
        //람다를 try/catch블록으로 감싸야한다.
        BufferedReaderProcessor p = (BufferedReader br)->br.readLine();
    }
}
