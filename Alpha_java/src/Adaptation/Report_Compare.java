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
		//파일의 갯수를 맵으로 파악하는 함수를 반환받기위한 변수 numF, numS
		Map<String, Integer> numF,numS;
		/*파일을 중복되는단어없이 맵으로 입력받은 두개의 맵 파일을 비교한 메소드에,
		 *반환값으로 중복된단어어레이리스트와, 최종 통합 맵을 동시에 받기위해 만든
		 *temp클래스의 필드 mapmix.*/
		temp mapmix;
		//토탈단어수 =sum, 중복된단어수 =overlap
		int sum=0, overlap=0;
		
		
		//Map을 사용하여 파일 각각의 고유의(중복되는것없이)단어 개수 카운트
		numF=wordnum(f1);
		numS=wordnum(f2);
		//Total WordCount
		sum = numF.size()+numS.size();
		System.out.println("Total Word Count = "+sum);
		
		//Overlap Word
		mapmix=eachmapMix(numF,numS);
		overlap = mapmix.SS.size();
		System.out.println("Overlap Word Count = "+overlap);
		
		System.out.println(sum/overlap+"%의 단어중복이 이루어져 있습니다");
	}
	
	//파일의 단어개수를 파악하는 wordnum메소드입니다
	Map<String, Integer> wordnum(File F) throws IOException
	{
		//파일F를 이용하여 파일리더 객체를 만듭니다.
		FileReader R = new FileReader(F);
		//파일리더객체 R을 이용하여버퍼리더 객체 B를 만듭니다.
		BufferedReader B = new BufferedReader(R);
		//그리고 워드카운터를 위해 만들어주는 wordcount HashMap객체를 만들어줍니다.
		Map<String, Integer> wordcount = new HashMap<>();
		//스캐너를 만들고 그 안의 내용은 B의 내용입니다.
		Scanner sentence = new Scanner(B);
		
		//다음줄이 존재하면 계속 진행하는 반복문을만들었습니다.
		while(sentence.hasNextLine())
		{
			//다음문자열 한줄을 공백으로 구분하여 토큰화하여 문자열배열에 넣어줍니다.
			String sv[] = sentence.nextLine().split(" ");
			
			//그 문자열배열의 크기만큼 반복하는 반문을 진행합니다.
			for(int i=0; i<sv.length;i++)
			{
				//워드카운트에 다 넣습니다. 카운트는 일부러 1만했습니다. 
				//이곳에서 카운트를 세는것은 의미가 없기 때문입니다.
				wordcount.put(sv[i], 1);
			}
		}
		
		B.close();
		R.close();
		return wordcount;
	}
	
	
	//eachmapMixd에서 합쳐진 Map파일, 겹친단어를 넣은 문자열배열을 반환받기위해 만든 class temp입니다.
	class temp{
		Map<String, Integer> MM;
		ArrayList<String> SS;
		
		public temp()
		{
			MM=null;
			SS=null;
		}
		
	}
	
	/*두 맵 파일을 합치는 eachmapMix메소드입니다.
	 *두 맵 파일을 합쳐 합쳐진 새로운 맵 파일을 반화하는 메소드입니다.
	 *이 메소드를 통해서 겹친단어를 알 수 있습니다.*/
	temp eachmapMix(Map<String,Integer> M1, Map<String,Integer> M2) throws FileNotFoundException
	{
		//반환값을 내놓기위한 temp객체 생성 
		temp t1= new temp();
		//Map을 하나 만들어 기존의 것 M2를 복제합니다.
		Map<String, Integer> M3 = M2;
		//M1을 KeySet으로 분해합니다
		Set keyset = M1.keySet();
		//분해한 Keyset을 한개의 문자열로 변환하고 그 문자열을 split하여 토큰화합니다
		String keylist[] = keyset.toString().split(", ");
		//ArrayList를 만들어 중복되는 단어들을 넣어주는 문자열배열을 만들어줍니다.
		ArrayList<String> overlapword = new ArrayList<String>();
	 	
		
		for(int i=0; i<keylist.length;i++)
		{
			//맵 wordcount에 sv[i]의 value값(integer)을 갖고와 counter변수에 넣습니다 
	        Integer counter = M3.get(keylist[i]);
	        //중복되는 단어가 아니면 새롭게 추가합니다
	        if(counter==null)
	        {
	        		M3.put(keylist[i],1);
	        }
	        //중복되는 단어면 카운트를 합니다. 그리고 중복되는단어문자배열에 넣어줍니다.
	        else {
	        		M3.put(keylist[i], counter+1);
	        		overlapword.add(keylist[i]);
	        }
		}
		//합친 최종 맵과 중복되는단어들의 문자열을 temp객체에 묶어 반환합니다.
		t1.MM=M3;
		t1.SS=overlapword;
		return t1;
		
	}
	
	
	
}