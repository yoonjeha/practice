package webproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input")
public class input extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public input() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String[] subject = request.getParameterValues("subject");
		// form태그내의 해당하는 값들을 가지고옴 return타입은 String
		
		PrintWriter out = response.getWriter();
		out.print("<h1>"+ id +"님 어서오세요!"+"</h1>");
		out.print("<h3>비밀번호는" + pw +"까먹지마세요!"+"</h3>");
		for(int i=0; i < subject.length; i++){
			out.print(subject[i] +" ");
			}
			out.print("를 선택하셨습니다.");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>post 방식으로 처리됨</h1>");
		out.close();
	}

}
