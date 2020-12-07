package webproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first6")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setAttribute("adress", "서울특별시 관악구 신사동");
		RequestDispatcher dispatch = request.getRequestDispatcher("second6");
		dispatch.forward(request, response);
		// 바인딩
		// 바인딩이란 데이터의 묶음을 의미한다. 하나 이상의 데이터들을 전달할 때 하나로 묶어서 전달하는 기법을 말한다.
		// 서버에서만 데이터 바인딩이 가능하다.
		// 단순한 요청은 브라우저를 통해서 가능하지만, DB 정보를 조회하거나 
		// 보안에 관련된 사항들은 dispatch를 이용하는 것이 바람직하다.
	}
}

