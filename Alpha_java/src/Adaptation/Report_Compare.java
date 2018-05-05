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
	File f1 = new File("News.txt");
	FileReader r1 = new FileReader(f1);
	BufferedReader b1 = new BufferedReader(r1);
	
	Map<String, Integer> wordcount = new HashMap<>();
	Scanner sentence = new Scanner(b1);
	
	
	public Report_Compare() throws IOException
	{
		
		
		
		b1.close();
		r1.close();
	}
	
	void mainop()
	{
		while(sentence.hasNextLine())
		{
			String sv[] = sentence.nextLine().split(" ");
			for(int i=0; i<sv.length;i++)
			{
				
			}
		}
	}
}