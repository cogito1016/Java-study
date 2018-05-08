package Adaptation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

//20144675KJH

public class Network_Basic {

	String hostname = "www.naver.com";
	
	public Network_Basic() throws IOException
	{
		this.getIP();
		this.urltest();
	}
	
	//URL의 IP주소 찾아오기
	void getIP()
	{
		/*예외처리하는방법은 Try-Catch와 Throws IOException이 있다.*/
		try
		{
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP주소 "+address.getHostAddress());
		}
		catch(UnknownHostException e)
		{
			System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다");
		}
	}
	
	//Html 소스코드 가져오기
	void urltest() throws IOException
	{
		//사이트에서 제일 먼저 보여지는 화면의 속성을 불러온다.
		
		/*http를 쓰면 302Found가 뜸 https를 써야함 
		 * http와 https의 차이는 보안의 차이이다. 요즘은 다 https */
		URL site = new URL("https://www.naver.com/");
		URLConnection url = site.openConnection();
		//바이트스트림을 문자스트림으로 연결해주는것.
		//버퍼드리드는 버퍼기능을 제공.
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
		
		String inLine;
		
		//결과적으로 네이버의 첫번쨰화면의 Html파일 소스를 긁어온다.
		while((inLine=in.readLine())!=null){
			System.out.println(inLine);
		}

	}
	
	//웹에서 이미지파일 다운로드하기
	void getImage()
	{
		
	}
	
	
}
