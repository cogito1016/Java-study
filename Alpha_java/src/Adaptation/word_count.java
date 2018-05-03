package Adaptation;

import java.util.*;
import java.io.*;

//코드해석 필수
//18.4.27은 역사적인 남북정상회담 일 입니다. 남북간의평화의합의가 이루어졌던 날입니다.
//따라서 남북지도자간의 판문점선언 

/*20144675김재형 파일을 불러읽어들여 토큰단위로 분활하여 단어의 수를 카운트하는 워드카운트 프로그램 작성
1.File을 불러읽어들인다.
2.BufferedReader을 생성하여 한줄씩 읽어오도록 시킨다.
3.단어와 카운트를 저장할 HASHMAP객체를 생성한다.
4.텍스트파일을 읽어들이기위하여 스캐너객체를 생성한다.
5.공백단위(띄어쓰기단위로 텍스트들을 저장할 문자열배열을 생성한다
6.그리고 그 문자열의 길이만큼을 반복하여 단어 하나하나를 파악하고 카운트합니다.
7.자세한 내용은 아래코드주석에 상세히 설명하였습니다 감사합니다.
*/



public class word_count {
   public static void main(String[] args) throws IOException {
      // panmoon.txt 파일을 읽어 옴.
      File pmFile = new File("panmoon.txt");
      FileReader pmRead = new FileReader(pmFile);
      //버퍼리더를 사용합니다.
      BufferedReader bfRead = new BufferedReader(pmRead);
      
      
      //맵을 사용하여 단어와 그 개수를 넣습니다.
      Map<String, Integer> wordcount = new HashMap<>();
      //스캐너객체를 생성합니다 이 객체는 텍스트를 불러읽어들이기 위함입니다.
      Scanner sentence = new Scanner(bfRead);
      

      /*한 줄씩 읽어들입니다 마지막줄까지 읽어들였다면 종료됩니다.
       *sentence는 공백을 기준으로 읽어들이는 문자열 배열입니다.*/
      while (sentence.hasNextLine()) {
         String sv[] = sentence.nextLine().split(" ");
         for (int i = 0; i < sv.length; i++) {
        	 
        	 	//맵 wordcount에 sv[i]의 value값(integer)을 갖고와 counter변수에 넣습니다 
            Integer counter = wordcount.get(sv[i]);
            
            //그 counter값이NULL이면 최촉값이 맵 wordcountd에 새로운 sv[i]키와 1value값을 넣습니다 
            if (counter == null)
               wordcount.put(sv[i], 1);
            //아니면 중복되었다는 뜻이므로 sv[i]키값에 기존 counter값+1의 값을 집어넣습니다!
            else
               wordcount.put(sv[i], counter + 1);
         }
      }

      
      
      //수업에 나온대로 Foreach문 + 람다식으로 단어의 횟수를 출력해보았습니다 이상입니다.
      wordcount.forEach((key, value) -> {
         System.out.println("'" + key + "'" + " 단어가 나온 횟수 : " + value);
      });

      // 텍스트 파일을 종료합니다.
      bfRead.close();
      pmRead.close();
   }
}
