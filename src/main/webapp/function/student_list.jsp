<%@ page contentType="text/html; charset=UTF-8" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initia-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>Student_list</title>
</head>

<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>

<div id="section1">
	<section>
		<p class="subtitle">学生管理</p>
		<p id="new">
			<p class="new_student"><a href="student_create.jsp">新規登録</a></p>
		</p>
		<form>
			<div class="student_list_main">	
				<div class="student_list1">
				<p>入学年度<br>
						<select name="ent-year" class="student_inner">
							<option value="" selected hidden>----------</option>
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
						</select>
					</p>
				</div>	
				<div class="student_list1">
					<p>
						クラス<br>
						<select name="class" class="student_inner">
							<option value="" selected hidden>----------</option>
							<option value="101">101</option>
							<option value="201">131</option>
							<option value="101">201</option>
						</select>
					</p>
				</div>
				<div class="student_list2">
					<p class="student-inner">
						<input type="checkbox" name="is-attend" value="在学中">在学中
					</p>
				</div>
				<div class="student_list_submit">
					<p class="student-inner">
						<input class="btn btn-secondary" type="submit" value="絞り込み">
					</p>
				</div>
			</div>
		</form>
		
		<p>検索結果:〇件<p>
<%--	一覧表示未完成 --%>
	</section>	
</div>

<%@include file="../footer.jsp" %>

