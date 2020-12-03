package webproj;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/inputServlet")
// 연동을 위해서는 form action에 해당 서블릿 명을 적어주면 된다.
public class inputServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init 메소드 호출");
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// Enumeration의 가장 중요한 개념이 커서라는 것입니다.
		// 커서란 현재의 위치를 가리키고 있는 것인데 최초 0부터 시작합니다.
		Enumeration enu=request.getParameterNames();
		//ParameterNames를 요청해 Enumeration의 객체로 만들겠다는 의미
		while(enu.hasMoreElements()) {
			// hanMoreElement()는 커서 바로 앞에 데이타가 들어있는지를 체크하는 것입니다.
			//현재 커서가 0이라면 첫번째칸을 가리키기 때문에 데이타가 하나라도 들어있다면 true를 리턴해 줍니다.
			String name=(String)enu.nextElement();
			String []values=request.getParameterValues(name);
			for(String value:values) {
			// for each문 values를 루프를 돌리고 values에 순차적으로 value를 대입하여 for문 수행
				System.out.println("name="+name+",value="+value);
			}
		}
	}
	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}
}

// 서블릿의 응답처리 방법
// doGet()이나 doPost() 메소드 안에서 처리함
// javax.servlet.http.HttpServletResponse 객체를 이용함
// setContentType()을 이용해 클라이언트에게 전송할 데이터 종류(MINE-TYPE)를 지정함
// MIME-TYPE
// 톰캣 컨테이너에 미리 지정해 놓은 데이터 종류로 서블릿에서 브라우저 전송 시 설정해서 사용함
// 예>
// HTML로 전송 시 : text/html
// 일반 텍스트로 전송 시 : text/plain
// XML 데이터로 전송 시 : application/xml

// HttpServletResponse를 이용한 서블릿 응답 실습 대략적인 순서
// 1.setContentType()를 이용해 MIME-TYPE
// 2.데이터를 출력할 PrintWriter 객체 생성
// 3.출력 데이터를 HTML형식으로 만듦
// 4.PrintWriter 의 print() 나 println()을 이용해 데이터 출력한다.

