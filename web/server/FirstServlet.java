package webproj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드 호출"); // 요청 시 맨 처음만 호출
	}
	
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) 
			throws ServletException, IOException {
			System.out.println("doGet 메소드 호출"); // 요청시 호출된다.
	}
	
	@Override
	public void destroy() { // 메모리에서 소멸될 때
		System.out.println("destry 메소드 호출");
	}
}
