<%@page contentType="text/html; charset=UTF-8" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initia-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>Test_regist</title>
</head>

<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>

<div class="section1">
	<section>
		<div class="subtitle">成績管理</div>
		<form>
			<div class="test_regist_main">
				<div class="regist_list1">
					<p>入学年度<br>
						<select class="regist_inner" name="ent-year">
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
				<div class="regist_list1">
					<p>クラス<br>
						<select name="class">
							<option value="101">101</option>
							<option value="201">131</option>
							<option value="101">201</option>
						</select>
					</p>
				</div>
				<div class="regist_list1">		
					<p>科目<br>
						<select name="subject">
							<option value="japanese">国語</option>
							<option value="math">数学</option>
						</select>
					</p>
				</div>
			</div>			
		</form>
	</section>
</div>


<%@include file="../footer.jsp" %>