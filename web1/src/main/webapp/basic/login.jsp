<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("userid");
	String pw = request.getParameter("password");

%>
<%=id %> <%=pw %> --%>

<h4>아이디 : <%=request.getParameter("userid") %></h4>
<h4>아이디 : <%=request.getParameter("password") %></h4>

</body>
</html>