package Adaptation;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
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
		this.getImage();
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
	void getImage() throws MalformedURLException
	{
		String website = "http://www.oracle.com/us/hp07-bg121314-openworld-2x-2280475.jpg";
		System.out.println(""+website+"사이트에서 이미지를 다운로드한다");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("test.jpg");) {
			int length=0;
			while((length=in.read(buffer))!=-1) {
				System.out.println(""+length+"바이트만큼 읽었음!");
				out.write(buffer,0,length);
			}
			in.close();
			out.close();
		}catch(Exception e) {
			System.out.println("예외"+e.getMessage());
		}
	}
	

	
	
	
	
	
	
	
}
