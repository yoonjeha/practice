package webproj;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/additional")
public class AdditionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ThirdServlet init 메소드 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int a=10;
		int b=20;
		int sum= a+b;
		response.setContentType("text/html; charset=UTF-8"); 
		//②html 출력을 위해서 PrintWriter import
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+a+"+"+b+"="+sum+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		System.out.println("ThirdServlet doPost 메소드 호출");
	}
}
