

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginTest5")
public class LoginTest5 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);
		if(session.isNew()) {
			session.setAttribute("loginUser", loginUser);
		}
		out.println("<html><head>");
		out.println("<script type='text/javascript'>");
		out.println("setTimeout('history.go(0);',5000");
		out.println("</script></head>");
		out.println("<body>");
		out.println("아이디는 " + loginUser.user_id + "<br>");
		out.println("총 접속자 수는 " + LoginImpl.total_user + "<br>");
		out.println("비밀번호는 " + user_pw + "<br>");
		out.println("</body></html>");
	}
}
