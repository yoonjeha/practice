<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.util.*"
    import="prac1215.*" %>
 <%
     request.setCharacterEncoding("UTF-8");
 %>
 <%
     String id = request.getParameter("id");
     String pwd = request.getParameter("pwd");
     String name = request.getParameter("name");
     String email = request.getParameter("email");

     MemberBean2 m = new MemberBean2(id, pwd, name, email);
     MemberDAO8 memberDAO = new MemberDAO8();
     memberDAO.addMember(m);
     //ȸ�������� ���̺� �߰��մϴ�.
     List membersList = memberDAO.listMembers();
    //��ü ȸ�������� ��ȸ�մϴ�. 
     %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ȸ�� ���â</title>
</head>
<body>
  <table width='100%' align='center'>
      <tr align='center' bgcolor = '#99ccff'>
        <td width="7%">���̵�</td>
        <td width="7%">��й�ȣ</td>
        <td width="5%">�̸�</td>
        <td width="11%">�̸���</td>
        <td width="5%">������</td>
  </tr>
  <%
      if(membersList.size()==0){
  %>
      <tr>
          <td colspan ="5">
              <p align = "center"><b><span style="font-szie:9pt;">
                          ��ϵ� ȸ���� �����ϴ�.</span></b></p>
         </td>
     </tr>

  <%
      } else{
          for(int i=0; i<membersList.size();i++){
              MemberBean2 bean = (MemberBean2) membersList.get(i);

  %>
      <tr align ="center">
          <td><%=bean.getId() %></td>
          <td><%=bean.getPwd() %></td>
          <td><%=bean.getName() %></td>
          <td><%=bean.getEmail() %></td>
          <td><%=bean.getJoinDate() %></td>
          </tr>
  <%
    } //end for
  }//end if
  %>
  <tr height = "1" bgcolor="#99ccff">
      <td colspan="5"></td>
      </tr>
  </table>
</body>
</html>