

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTest4")
public class SessionTest4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doHandle(request, response);
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doHandle(request, response);
	    }

	    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	        request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html;charset=utf-8");

	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();

	        String user_id = request.getParameter("user_id");

	        if(session.isNew()) {    //세션이 새로 만들어졌을때
	            if(user_id != null) {
	                session.setAttribute("user_id", user_id);    //세션에 등록
	                out.print("<a href='SessionTest4'>로그인 상태 확인</a>");
	            }else {
	                out.print("<a href='/DB/login2.html'>다시 로그인 하세요</a>");
	                session.invalidate();    //세션 소멸
	            }
	        }else {    //세션이 이미 존재할때
	            user_id = (String) session.getAttribute("user_id");    //세션 이름을 값 가져오기
	            if(user_id != null && user_id.length() != 0) {
	                out.print("안녕하세요 " + user_id + "님");
	            }else {
	                out.print("<a href='/DB/login2.html'>다시 로그인 하세요</a>");
	                session.invalidate();    //세션 소멸
	            }
	        }
	    }
}
