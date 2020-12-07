package webproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second6")
public class second6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String adress = (String)request.getAttribute("adress");
		System.out.println("adress : " + adress);
		
		out.println("<html><body>");
		out.println("주소 : " + adress);
		out.println("<br>");
		out.println("redirect를 이용한 바인딩 실습");
		out.println("</body></html>");
	}
}
