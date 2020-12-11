

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTest5")
public class SessionTest5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		if (session.isNew()) {
			if(user_id !=null) {
			session.setAttribute("user_id", user_id);
			String url= response.encodeURL("SessionTest5");
			// 변수 url에 encodeURL()을 이용하여 응답시 미리 jsessionid를 저장한다.
			out.println("<a href="+url+">로그인 상태 확인</a>");
			// 로그인 상태 확인시 jsessionid를 서블릿으로 다시 전송한다. 
			// jsessionid :
			// 세션에서 사용되는 쿠키 이름 입니다.
			// 쿠키는 클라이언트에, 세션은 서버에 저장되는 걸로 알고 있는 게 일반적이고, 
			// 그러므로 쿠키보단 세션이 보안에 좋다는 건 기본적인 상식일 겁니다. 
			// 하지만 세션 또한 쿠키 형태로 서버와 클라이언트간에 주고 받습니다.
		} else {
			out.print("<a href='login3.html'>다시 로그인 하세요!</a>");
			session.invalidate();
			}
		}
		else {
		user_id = (String) session.getAttribute("user_id");
		if (user_id != null && user_id.length() != 0) {
			out.print("안녕하세요." + user_id + "님!");
			session.invalidate();
		} else {
			out.print("<a href='login3.html'>다시 로그인 하세요!!!</a>");
			session.invalidate();
			}
		}
	}
}
