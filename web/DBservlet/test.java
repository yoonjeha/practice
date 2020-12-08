import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.sql.*;

import javax.sql.*;//DataSource 클래스를 위해 사용

import javax.naming.*;//JNDI를 위해 사용


@WebServlet("/test")
public class test extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.setCharacterEncoding("euc-kr");

		

		String subject = request.getParameter("subject");
		String author = request.getParameter("author");
		String contents = request.getParameter("contents");

		response.setContentType("text/html;charset=euc-kr");

		PrintWriter out = response.getWriter();
		out.println("<html><body><center><h3>");


		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "insert into Round16_Table_01 values (null, ?, ?, ?)";

		
		try {
			Context context = new InitialContext();
			//JNDI를 이용하기 위한 객체 생성
			DataSource source = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
  // lookup(): 등록된 naming 서비스로부터 자원을 찾고자할 때 사용하는 메서드
			//context 객체를 통해 이름으로 Resource를 획득한다. 
  //("jdbc/myconn"): JNDI 서비스에 접근하기 위한 기본 이름(이 자원을 찾겠다.--> web.xml의 <res-ref-name>
			//JNDI의 모든 이름은 기본적으로 java:comp/env에 등록되어 있다.
			//해당 영역에서 jdbc/myconn으로 설정된 이름을 획득한다.
			conn = source.getConnection();
			//source로 부터 Connection 객체를 획득한다. 
			//이 객체는 이제 Container의 DBCP에 의해 관리된다. 

		}catch(Exception e) {}
		try {			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, subject);
			pstmt.setString(2, author);
			pstmt.setString(3, contents);

			int res = pstmt.executeUpdate();
			if(res > 0)
				out.println("Success Save!!");

			pstmt.close();
			conn.close();

		}catch(Exception e) {
			out.println("SQL Process Error : " + e.getMessage());

		}	
		out.println("</h3></center></body></html>");
	}
}

