package Adaptation;

import java.io.IOException;
import java.net.ServerSocket;

/*20144675 KJH 김재형 
 *네트워크 중 서버-클라이언트통신에 대한 수업
 **/
public class Serverclient {
	ServerSocket ss;
	
	public Serverclient()
	{
		
	}
	
	void Server() throws IOException
	{
		ss = new ServerSocket(9100);
	}
	
	void Client()
	{
		
	}
}
