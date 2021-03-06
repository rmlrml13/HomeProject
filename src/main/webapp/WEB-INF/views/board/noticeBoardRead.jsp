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

	<!-- μ΅μλ¨ -->
	<div class="topBanner">
		<span><a href="#" class="bannerText"> π μ§κ΅¬μ λ  κΈ°λ! μ΅λ 90%
				ν μΈ! π </a></span>
	</div>

	<!-- νμ΄ν λ° μ μ λ°μ€ -->
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

	<!-- λ©μΈ λ©λ΄ -->
	<div id="mainMenu">
		<div class="menuBox">
			<div class="gameDropDownMenu">
				<div>
					<span>κ²μ</span>
				</div>
				<div>
					<span>κ°μ΄ ν΄μ©</span>
				</div>
				<div>
					<span>κ³΅μ§μ¬ν­</span>
				</div>
				<div>
					<span>κ³ κ°μΌν°</span>
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

	<a href="noticeBoardList">λͺ©λ‘μΌλ‘</a>
</body>
</html>