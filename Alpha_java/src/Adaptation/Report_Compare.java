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
		System.out.println(sum);
		
		compare(numF,numS);

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
	
	/*두 파일의 중보되는 단어의 개수를 파악하는 compare메소드
	 *두 파일을 분석한 결과로의 Map타입의 객체를 매개변수로 받는 compare메소드입니다*/
	void compare(Map<String,Integer> M1, Map<String,Integer> M2) throws FileNotFoundException
	{
		Map<String,Integer> mapF = M1;
		Map<String,Integer> mapS = M2;
			
		int i=0,j=0,count=0;
		String S1 = mapF.toString();
		String S1test[] = S1.split(" ");
		
		String S2 = mapS.toString();
		String S2test[] = S2.split(" ");
		
		System.out.println(S1test[5]);
		
		while(i<S2test.length)
		{
			//System.out.println(i+"i");
			while(j<S1test.length)
			{
				//System.out.println(j+"J");
				if(S2test[i]==S1test[j])
				{
					count++;
					System.out.println(S2test[i]+"겹친다");
				}
				
				
				j++;
			}
			j=0;
			i++;
		}
		
		
	}
	
	
	
}