<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//장바구니 세션 제거
	session.removeAttribute("products");
%>
<h4><a href="cart.html">상품선택</a></h4>
</body>
</html>