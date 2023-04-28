<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	form 안에 type=file 요소가 포함되었다면, enctype 을 꼭 설정해야함 
	==> enctype="multipart/form-data"

	"application/x-www-form-urlencoded" 이 기본값임
--%>
	<form action="upload.jsp" method="post" enctype="multipart/form-data">
		<div>
			<label for="name">name</label>
			<input type="text" name="name" id="name"/>
		</div>
		<div>
			<label for="file1">file1</label>
			<input type="file" name="file1" id="file1"/>
		</div>
		<div>
			<button type="submit">전송</button>
		</div>
	</form>
</body>
</html>