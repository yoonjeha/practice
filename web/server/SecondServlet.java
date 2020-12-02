package webproj;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// annotation을 이용하여 web.xml에 직접 매핑할 필요없어짐
@WebServlet("/aaa")
public class SecondServlet extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드 호출 >>>>>"); // 요청 시 맨 처음만 호출
	}
	
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) 
			throws ServletException, IOException {
			System.out.println("doGet 메소드 호출 >>>>>"); // 요청시 호출된다.
	}
	
	@Override
	public void destroy() { // 메모리에서 소멸될 때
		System.out.println("destry 메소드 호출 >>>>>");
	}
}