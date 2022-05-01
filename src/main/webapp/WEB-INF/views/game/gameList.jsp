<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GameList</title>
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
	
	<div class="head-main"></div>
	<div class="flex">
		<div class="basic tag-bar">
			<div class="tag-box">RPG</div>
			<div class="tag-box">공포</div>
			<div class="tag-box">전략</div>
			<div class="tag-box">FPS</div>
			<div class="tag-box">기타</div>
		</div>
		<div class="board-main">
			<div class="padding-top flex">
				<div>
					<input class="basic-input" type="text" placeholder="검색" name="search">
					<input type="submit" value="검색">
				</div>
				<div>
				<span>정렬 기준 </span>
					<select>
						<option>연관성</option>
						<option>인기순</option>
						<option>최신순</option>
						<option>추천순</option>
					</select>
				</div>
				
			</div>
			<div class="board-body padding-top">
			<c:forEach var="list" items="${list}">
				<div class="board-content flex">
					<div class="game-content">
						<a href="gameRead?game_no=${list.game_no}">${list.game_no}</a>
					</div>
					<div class="game-content">
						<a href="gameRead?game_no=${list.game_no}">${list.game_title}</a>
					</div>
					<div class="game-content">
						<a href="gameRead?game_no=${list.game_no}">${list.game_price}</a>
					</div>
				</div>
			</c:forEach>
			</div>
		</div>
		
	</div>

</body>
</html>