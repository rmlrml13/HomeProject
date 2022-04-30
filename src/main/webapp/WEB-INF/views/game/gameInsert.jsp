<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeBoard</title>
</head>
<link href="${path}/resources/css/mine.css" rel="stylesheet" />
<body>
	<form action="noticeBoardInsert" method="post">
		글 제목 : <input type="text" name="notice_title" id="notice_title"> <br>
		글 내용 : <input type="text" name="notice_content" id="notice_content"> <br>
		<input type="submit" value="작성">
	</form>
</body>
</html>