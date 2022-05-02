<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NOTICE-BOARD-READ</title>
<link rel="stylesheet" href="${path}/resources/css/style.css">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Fredoka+One&family=Noto+Sans+KR&family=Playfair+Display:wght@500&display=swap')
	;
</style>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
</head>
<link href="${path}/resources/css/mine.css" rel="stylesheet" />
<body>
	<script src="https://kit.fontawesome.com/3636334fb2.js"
		crossorigin="anonymous"></script>

	<!-- 최상단 -->
	<div class="topBanner">
		<span><a href="#" class="bannerText"> 🌏 지구의 날 기념! 최대 90%
				할인! 🌏 </a></span>
	</div>

	<!-- 타이틀 및 유저박스 -->
	<div id="wrapper">
		<div id="titleLogo">
			<span class="iTag"><i class="fa-solid fa-frog fa-bounce fa-lg"></i></span>
		</div>
		<div class="mainTitle">
			<a href="#" class="froGame">FROGame</a>
		</div>
		<div class="userBox">
			<span><i class="fa-solid fa-user-check"></i></span> <span><i
				class="fa-solid fa-user-plus"></i></span> <span><i
				class="fa-solid fa-cart-arrow-down"></i></span>
		</div>
	</div>

	<!-- 메인 메뉴 -->
	<div id="mainMenu">
		<div class="menuBox">
			<div class="gameDropDownMenu">
				<div>
					<span>게임</span>
				</div>
				<div>
					<span>같이 해용</span>
				</div>
				<div>
					<span>공지사항</span>
				</div>
				<div>
					<span>고객센터</span>
				</div>
			</div>
		</div>
	</div>

	<div class="board-main">
		<div class="board-content">
			<div>${dto.notice_title}</div>
			<div>${dto.notice_content}</div>
			<div>${dto.notice_regdate}</div>
			<div>${dto.notice_count}</div>
		</div>
	</div>

	<a href="noticeBoardList">목록으로</a>
</body>
</html>