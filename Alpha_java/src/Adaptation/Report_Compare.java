package Adaptation;
//20144675KJH 김재형

import java.util.*;
import java.io.*;
/*리포트 비교 프로그램 작성
 *최대한 교수님말대로 화일처리+컬렉션(Map)을 사용하여 구현해보도록 하겠습니다.
 **/

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
}