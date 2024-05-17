<%@page contentType="text/html; charset=UTF-8" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initia-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>Student_create</title>
</head>


<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>


<%--学生情報の入力をここでさせる（未完成）--%>
<%-- <form action="StudentCreate.action" method="post"> --%>
<div id="section1">
	<section>
		<div class="subtitle">学生情報登録</div>
		<div class="student_create_main">
			<dt>入学年度</dt>
			<dd><select class="student_create_inner" name="ent-year" required>
							<option value="" selected hidden >----------</option>
							<option value="2000">2000</option>
							<option value="2001">2001</option>
							<option value="2002">2002</option>
							<option value="2003">2003</option>
							<option value="2004">2004</option>
							<option value="2005">2005</option>
							<option value="2006">2006</option>
							<option value="2007">2007</option>
							<option value="2008">2008</option>
							<option value="2009">2009</option>
							<option value="2010">2010</option>
							<option value="2011">2011</option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
						</select></dd>
			<dt>学生番号</dt>
			<dd><input class="student_create_inner" type="text" name="no" value="" placeholder ="学生番号を入力してください" required></dd>
			<dt>氏名</dt>
			 <dd><input class="student_create_inner" type="text" name="name" value="" placeholder ="氏名を入力してください" required></dd>
			<dt>クラス</dt>
			<dd><select name="ent-year" class="student_create_inner">
				<option value="101">101</option>
				<option value="102">102</option>
				<option value="201">201</option> 
			</select></dd>
			<p><input class="btn btn-secondary" type="submit" value="登録して終了"</p>
			<br>
			<a href="javascript:history.back()">戻る</a>
		</div>
	</section>
</div>
<%--</from>--%>

<%@include file="../footer.jsp" %>