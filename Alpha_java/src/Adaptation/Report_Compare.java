package Adaptation;
//20144675KJH 김재형

import java.util.*;
import java.io.*;
/*리포트 비교 프로그램 작성
 *최대한 교수님말대로 화일처리+컬렉션(Map)을 사용하여 구현해보도록 하겠습니다.
 *다음과 같은 알고리즘으로 수행해보겠습니다.
 *1. Read each report to file.
 *2. Input each report to token, using 2 map.
 *   **In map, each token must not overlap.**
 *3. Then, I will have two map that have non-overlap token.
 *4. Finally, I need two data.
 *   -One is total word count(Map1.key + Map2.key)
 *   -Two is Overlap word count(Map1.key && Map2.key)
 *5. Final op = > OverlapWordCount/TotalWordCount*/


public class Report_Compare {
	File f1 = new File("News1.txt");
	File f2 = new File("News2.txt");
	
	public Report_Compare() throws IOException
	{
		Map<String, Integer> numF,numS;
		int sum=0;
		//Map을 사용하여 파일 각각의 고유의(중복되는것없이)단어 개수 카운트
		numF=wordnum(f1);
		numS=wordnum(f2);
		//Total WordCount
		sum = numF.size()+numS.size();
		

	}
	
	//파일의 단어개수를 파악하는 wordnum메소드입니다
	Map<String, Integer> wordnum(File F) throws IOException
	{
		FileReader R = new FileReader(F);
		BufferedReader B = new BufferedReader(R);
		Map<String, Integer> wordcount = new HashMap<>();
		Scanner sentence = new Scanner(B);
		
		while(sentence.hasNextLine())
		{
			String sv[] = sentence.nextLine().split(" ");
			
			for(int i=0; i<sv.length;i++)
			{
				wordcount.put(sv[i], 1);
			}
		}
		
		B.close();
		R.close();
		return wordcount;
	}
	
	//두 파일의 중보되는 단어의 개수를 파악하는 compare메소드
	//두 파일을을 입력받아
	void compare(Map<String,Integer> M1, File M2) throws FileNotFoundException
	{
		
		
		
	}
	
	
	
}