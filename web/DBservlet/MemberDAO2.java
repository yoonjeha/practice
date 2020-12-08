
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO2 {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 기반으로 하는 드라이버를 선언
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// 연동할 DB의 주소를 선언
	private static final String user = "scott";
	// DB의 userID를 상수로 선언
	private static final String pwd = "tiger";
	// DB의 비밀번호를 상수로 선언
	private Connection con;
	// DB접속에 사용하는 con 변수
	private Statement stmt;
	// 상태를 피드백하는 stmt 변수

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		////MemberVO을 제네릭으로 받아서 ArrayList 인 list 객체를 생성
		try {
			connDB();
			//connDB 메서드 호춣
			
			String query = "select * from t_member ";
			// 질의문을 저장한다.
			System.out.println(query);
			// 질의문 출력 
			ResultSet rs = stmt.executeQuery(query);
			// 1. 수행결과로 ResultSet 객체의 값을 반환합니다.
			// 2. SELECT 구문을 수행할 때 사용되는 함수입니다.
			while (rs.next()) {
				// next()
				//공백을 기준으로 입력을 받는다. 즉, 띄어쓰기(=\\s)을 기준으로 입력을 받는다.
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				// id,pwd,name,email,joinData를 게터를 통해 받아옴
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				//객체의 세터 메서드등을 실행
				list.add(vo);
				// 리스트의 vo를 add
			}
			rs.close();
			// 셋리설트 종료
			stmt.close();
			// 스테이트먼트 종료
			con.close();
			// con 종료
		} catch (Exception e) {
			e.printStackTrace();
			// 예외처리문
		}
		return list;
			// 정상 실행시 list 수행 
	}

	private void connDB() {
		try {
			Class.forName(driver);
			//ojdbc 실행
			System.out.println("Oracle 드라이버 로딩 성공");
			// 드라이버 로딩 성공시 출력
			con = DriverManager.getConnection(url, user, pwd);
			// 이 getConnection 메서드는 javax.sql.DataSource 인터페이스의
			//getConnection 메서드에 의해 지정된다.
			//URL,USERNAME,PASSWORD를 매겨변수로 받는다.
			System.out.println("Connection 생성 성공");
			//연동 성공시 출력
			stmt = con.createStatement();
			//Statement 객체를 생성하면 Statement 객체의 executeQuery() 메소드를 호출하여 
			//SQL 질의를 실행시킬 수 있다. 메소드의 인수로는 SQL 질의 문장을 담은 String 객체를 전달한다.
			//Statement 객체는 단순한 질의문을 사용할 경우에 좋다.
			System.out.println("Statement 생성 성공");
			//질의 성공시 출력
		} catch (Exception e) {
			e.printStackTrace();
			//예외 처리문
		}
	}
}
