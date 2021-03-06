<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GameList</title>
<link rel="stylesheet" href="${path}/resources/css/gameList.css">
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
<link href="${path}/resources/css/style.css" rel="stylesheet" />
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
	<img alt="" src="${file}">
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
	
	<div class="head flex">
		<div class="head-main"></div>
		<div class="head-sub"></div>
	</div>
	<div class="flex">
		<!-- <div class="tag-bar">
			<div class="tag-box">
				<a href="#">RPG</a>
			</div>
			<div class="tag-box">
				<a href="#">κ³΅ν¬</a>
			</div>
			<div class="tag-box">
				<a href="#">μ λ΅</a>
			</div>
			<div class="tag-box">
				<a href="#">FPS</a>
			</div>
			<div class="tag-box">
				<a href="#">κΈ°ν</a>
			</div>
		</div> -->
		<div class="board-main">
			<form action="gameSearch">
				<div class="padding-top flex">
					<div>
						<input class="basic-input" type="text" placeholder="κ²μ"
							name="search" id="search"> <input type="submit"
							value="κ²μ" class="basic-btn">
					</div>
					<div>
						<span>μ λ ¬ κΈ°μ€ </span> <select>
							<option>μ°κ΄μ±</option>
							<option>μΈκΈ°μ</option>
							<option>μ΅μ μ</option>
							<option>μΆμ²μ</option>
						</select>
					</div>
				</div>
			</form>
			<div class="board-body padding-top">

				<c:forEach var="img" items="${img}" varStatus="status">
					<div class="board-content flex">
						<div class="game-content">
							<a href="gameRead?game_no=${jjin[status.index].game_no}"><img
								src="${img}" width="200px"></a>
						</div>
						<div class="game-content">
							<a href="gameRead">${jjin[status.index].game_title}</a>
						</div>
						<div class="game-content">
							<a href="gameRead">β© <fmt:formatNumber type="number" maxFractionDigits="3" value="${jjin[status.index].game_price}" /></a>
						</div>
						<div class="game-content">
							<a href="gameRead"><fmt:formatDate
									value="${jjin[status.index].game_regdate}" pattern="yyyy-MM-dd" /></a>
						</div>
					</div>
				</c:forEach>
				<div class="pageInfo_wrap">
					<div class="pageInfo_area">
						<ul id="pageInfo" class="pageInfo">
							<!-- μ΄μ νμ΄μ§ λ²νΌ -->
							<c:if test="${pageMaker.prev}">
								<li class="pageInfo_btn previous"><a
									href="${pageMaker.startPage-1}">Previous</a></li>
							</c:if>
							<!-- κ° λ²νΈ νμ΄μ§ λ²νΌ -->
							<c:forEach var="num" begin="${pageMaker.startPage}"
								end="${pageMaker.endPage}">
								<li class="pageInfo_btn"><a href="${num}">${num}</a></li>
							</c:forEach>
							<!-- λ€μνμ΄μ§ λ²νΌ -->
							<c:if test="${pageMaker.next}">
								<li class="pageInfo_btn next"><a
									href="${pageMaker.endPage + 1 }">Next</a></li>
							</c:if>
						</ul>
					</div>
				</div>
				<form id="moveForm" method="get">
					<input type="hidden" name="pageNum"
						value="${pageMaker.cri.pageNum }"> <input type="hidden"
						name="amount" value="${pageMaker.cri.amount }">
				</form>
			</div>
		</div>
	</div>


<script type="text/javascript" src="${path}/resources/js/gameList.js"></script>

</body>
</html>