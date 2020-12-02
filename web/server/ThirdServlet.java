package webproj;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// annotation을 이용하여 web.xml에 직접 매핑할 필요없어짐
// 이전에 "/aaa"에 매핑 했기 때문에 이번에는 다른 곳에 매핑해야 오류가 발생하지 않음
// 따라서 third는 "/abc"에 매핑함
@WebServlet("/abc")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ThirdServlet init 메소드 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		System.out.println("ThirdServlet doGet 메소드 호출");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		System.out.println("ThirdServlet doGet 메소드 호출");
	}
}

// 어노테이션을 이용한 서블릿 매핑 시는 반드시 extends HttpServlet 을 상속 받아야 한다.
// web.xml에 여러 서블릿 매핑 설정 시 복잡해짐.
// 따라서 서블릿 클래스에 직접 어노테이션으로 서블릿명을 설정하면 가독성이 좋아진다.
// @WebServlet을 이용해서 서블릿 매핑을 구현함