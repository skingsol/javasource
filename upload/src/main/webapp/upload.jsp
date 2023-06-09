<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.UUID"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	//현재 request에 file upload 요청이 들어 있는지 확인
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);

	if(isMultipart){
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		List<FileItem> items = upload.parseRequest(request);
		
		Iterator<FileItem> iter = items.iterator();
		
		String name = null, value = null;
		
		while (iter.hasNext()) {
		    FileItem item = iter.next();
			
		    //일반요소
		    if (item.isFormField()) {
		    	name = item.getFieldName();
		        value = item.getString("utf-8");
		        out.print("<h3>일반데이터</h3>");
		        out.print(name+" : "+value+"<br>");
		    } else { // 파일요소
		    	name = item.getFieldName();
		        value = item.getName();
		        long size = item.getSize();
		        
		        out.print("<h3>파일데이터</h3>");
		        out.print(name+" : "+value+" - "+ size + "<br>");
		        
		        //파일 저장
		        if(!name.isEmpty()){
		        	String path = "c:\\upload";
/* 		        	File f = new File(path+"\\"+value); // 업로드 폴더경로에 가서 파일객체 만드는 코드
		        	item.write(f); //파일저장 코드
		        	 */
		        	//고유값 생성
		        	UUID uuid = UUID.randomUUID();
		        	
		        	File f = new File(path+"\\"+uuid.toString()+"_"+value); // c:\\upload\\고유값_test.html
		        	item.write(f); //파일저장 코드
		        	
		        	//다운로드를 위한 링크 생성
		        	String encodeName = URLEncoder.encode(f.getName(),"utf-8");
		        	
		        	out.print("<p>");
		        	out.print("<a href='download.jsp?fileName="+encodeName+"'>"+value+"</a>");
		        	out.print("</p>");
		        	
		        	
		        }
		        
		        
		    }
		}
	}
%>