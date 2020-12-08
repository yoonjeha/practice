
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAO3 {
   /*
    *  private static final String driver = "oracle.jdbc.driver.OracleDriver";
      driver ojdbc의 경로로 불러오는것 
      private static final String url = "jdbc:oracle:thin:@localhost:1521:myoracle";
      //orcle 경로 불러오기 
      private static final String user = "scott";
      //유저 scott
      private static final String pwd = "tiger";
      //비밀번호 tiger
    */
   private Connection con;
   private PreparedStatement pstmt;
   private DataSource dataFactory;
   
   public MemberDAO3() {
      try {
         Context ctx = new InitialContext();
         Context envContext = (Context) ctx.lookup("java:/comp/env");
         
         dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
         
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   public List listMembers() {
      List list = new ArrayList();
      try {
         //connDB();
         con=dataFactory.getConnection();
         String query = "select * from t_member";
         System.out.println("prepareStatement: "+query);
         pstmt = con.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            String id = rs.getString("id");
            String pwd = rs.getString("pwd");
            String name = rs.getString("name");
            String email = rs.getString("email");
            Date joinDate = rs.getDate("joinDate");
            MemberVO vo= new MemberVO();
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
      }catch(Exception e) {
         e.printStackTrace();
      }
      return list;
   }
}