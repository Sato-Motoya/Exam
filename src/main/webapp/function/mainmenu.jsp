<%@page contentType="text/html; charset=UTF-8" %>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/style.css">
</head>


<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>


<section>
<h2>
	メニュー
</h2>

<h3>
	<p><a href="student_list.jsp">学生管理一覧</a></p>
	<li>成績管理</li>
	<li><a href="test_regist.jsp">成績管理一覧</a></li>
	<li><a href="test_list.jsp">成績参照検索</a></li>
	<p><a href="#">科目管理一覧</a><p>

</h3>
</section>



<%@include file="../footer.html" %>