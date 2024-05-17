<%@page contentType="text/html; charset=UTF-8"%>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initia-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>Main menu</title>
</head>


<%@include file="../header.jsp"%>
<%@include file="menu.jsp"%>

<<<<<<< HEAD
<div id="section1">
	<section>
		<p id="subtitle">メニュー</p>
=======

<section>
<h2>
	メニュー
</h2>

<h3>
	<p><a href="student_list.jsp">学生管理一覧</a></p>
	<li>成績管理</li>
	<li><a href="test_regist.jsp">成績管理一覧</a></li>
	<li><a href="test_list.jsp">成績参照検索</a></li>
	<p><a href="../function/SubjectList.action">科目管理一覧</a><p>

</h3>
</section>
>>>>>>> branch 'master' of https://github.com/Sato-Motoya/Exam.git



<<<<<<< HEAD
		<div class="main">
			<div class="row">
				<div class="col-4">
					<div class="group-inner1 d-flex align-items-center justify-content-center">					
						<a href="student_list.jsp">学生管理</a>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<div class="group-inner2 d-flex align-items-center justify-content-center">
						<p>
							成績管理<br>
							<a href="test_regist.jsp">成績管理一覧</a><br>
							<a href="test_list.jsp">成績参照検索</a>
						</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<div class="group-inner3 d-flex align-items-center justify-content-center">
						<p><a href="#">科目管理一覧</a></p>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>


<%@include file="../footer.jsp"%>
=======
<%@include file="../footer.jsp" %>
>>>>>>> branch 'master' of https://github.com/Sato-Motoya/Exam.git
