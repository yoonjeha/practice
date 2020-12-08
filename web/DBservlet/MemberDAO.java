
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
   
   /*
    * private static final String driver = "oracle.jdbc.driver.OracleDriver";
    * private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    * private static final String user = "scott"; 
    * private static final String pwd ="tiger";
    */
   
   private Connection con;
   private PreparedStatement pstmt;
   /*
    
    - Statement 클래스의 기능 향상
    - 인자와 관련된 작업이 특화(매개변수)
    - 코드 안정성 높음. 가독성 높음.
    - 코드량이 증가 -> 매개변수를 set해줘야하기 때문에..
    - 텍스트 SQL 호출
    
    */

   public List listMembers() {
      List list = new ArrayList();
      try {
         connDB();
         String query = "select * from t_member ";
         System.out.println("prepareStatememt: " + query);
         pstmt = con.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery();
         while (rs.next()) {
            String id = rs.getString("id");
            String pwd = rs.getString("pwd");
            String name = rs.getString("name");
            String email = rs.getString("email");
            Date joinDate = rs.getDate("joinDate");
            MemberVO vo = new MemberVO();
            vo.setId(id);
            vo.setPwd(pwd);
            vo.setName(name);
            vo.setEmail(email);
            vo.setJoinDate(joinDate);
            list.add(vo);
         }
         rs.close();
         pstmt.close();
         con.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
      return list;
   }

   private void connDB() {
      try {
         Class.forName( "oracle.jdbc.driver.OracleDriver");
         System.out.println("Oracle 드라이버 로딩 성공");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
         System.out.println("Connection 생성 성공");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}