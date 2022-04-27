<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 등록</title>
</head>
<body>
	
	<form action="boardInsert" method="post">
		글 제목 : <input type="text" name="b_title" id="b_title"> <br>
		글 내용 : <input type="text" name="b_content" id="b_content"> <br>
		작성자 :  <br>
		<input type="submit" value="등록">
	</form>
	
</body>
</html>


