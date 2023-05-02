<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자가 다운로드 받기를 원하는 파일명
	String fileName = request.getParameter("fileName");
	
	// 서버 폴더에 가서 사용자가 요청한 해당 파일 가져오기
	// 자바 File
	FileInputStream fis = new FileInputStream("c:\\upload\\"+fileName);
	BufferedInputStream bis = new BufferedInputStream(fis);
	
	out.clear();
	out = pageContext.pushBody();
	
	//브라우저에 파일 붙여서 보내기
	//uuid 값을 제거 : 1d2aab13-2ddc-42_papago.url
	fileName = fileName.substring(fileName.lastIndexOf("_") + 1);
	//인코딩
	fileName = URLEncoder.encode(fileName, "urf-8").replace("\\+", "%20");
	response.setContentType("application/octet-stream"); //MIME 타입
	response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	
	BufferedOutputStream buf = new BufferedOutputStream(response.getOutputStream());
	
	int numRead=0;
	byte[] b = new byte[4896];
	while((numRead = bis.read(b))!=-1){
		buf.write(b,0,numRead);
	}
	
	buf.flush();
	buf.close();
	bis.close();
%>