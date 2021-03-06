package HTTP;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import echo.WorkThread;
import edu.iot.common.util.FileUtil;

public class HttpThread extends WorkThread {
	public HttpThread(Socket socket) {
		super(socket);
	}

	@Override
	public void process(BufferedReader r, PrintWriter w) throws Exception {
//		브라우저의 요청 내용 확인
		
		System.out.println("==============================");
		String request = r.readLine();
		System.out.println("요청 라인 : "+request);
		
		String[] tokens = request.split(" ");
		String method = tokens[0];
		String url = tokens[1];
		String protocol = tokens[2];
		
		System.out.println("요청 파일 : "+url);
		
		System.out.println("헤더 내용----------------------");
		Map<String, String> headers = new HashMap<>();
		while(true) {
			String str = r.readLine();
			if(str.isEmpty())
				break;
			String[] head= str.split(":");
			headers.put(head[0].trim(), head[1].trim());
		}
		
		System.out.println(headers);
		System.out.println("==============================");

				
		
//		브라우저로 출력
		String content = FileUtil.readResource(url);
		
		w.println(content);
		w.flush();
		
	}
}