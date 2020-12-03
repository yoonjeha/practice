package webproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public void init() {
    	System.out.println("init 메소드 호출");
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + pw);
		
		if(id!=null &&(id.length()!=0)) {
			out.print("<html><body>");
			out.print(id + " 님 ! 로그인 하셨습니다.");
			out.print("</body></html>");
		} else {
			out.print("<html><body>");
			out.print("아이디를 입력하세요 !!!");
			out.print("<br>");
			out.print("<a href='http://localhost:8080/login.html'>로그인창으로 이동</a>");
			// 기존의 login.html 은 get방식으로 데이터를 전송하여 post방식으로 변경
			// servlet 매핑해주어 작동하게함 
			// (원래 id/pw에 써뒀던 required를 지워 작동하게함)
			out.print("</body><html>");
		}
	}
		public void destroy() {
			System.out.println("destroy 메소드 호출");
		
	}
}
