package webproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public void init() throws ServletException {
    	System.out.println("init 메소드 호출");
    }
		// html에서 post방식을 활용하여 로그인 하기를 선택했기 때문에
		// doPost에 작성함
		// Get과 Post의 차이
		// get은 사용자가 입력한 결과를 알 수 있도록 내용 공개
		// post는 사용자가 입력한 내용을 발송할 때 공개하지 않음
		// 따라서 로그인은 비밀번호등 보안이 필요한 부분이 있기 때문에
		// post방식으로 작성	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String add = request.getParameter("user_address");
		
		String data = "<html>";
		data += "<body>";
		data += "아이디 : " + id;
		data += "<br>";
		data += "비밀번호 : " + pw;
		data += "<br>";
		data += "주소 : " + add;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}
}
