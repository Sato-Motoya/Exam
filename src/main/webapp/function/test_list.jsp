<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.jsp" %>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initia-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>Test_list</title>
</head>

<%@include file="menu.jsp" %>

<div class="section1">
	<section>
		<p class="subtitle">成績参照</p>
		<form>
			<div class="test_list_main">
				<div class="test_sub">
					<p>科目情報</p>
				</div>
				<div class="test_list1">
					<dl>
						<dt>入学年度</dt>
						<dd>
							<select class="test_list_inner" name="ent-year">
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
						</dd>
					</dl>
				</div>
				<div class="test_list1">
					<dl>
					 	<dt>クラス</dt>
				 		<dd>
							<select class="test_list_inner" name="class">
								<option value="101">101</option>
								<option value="201">131</option>
								<option value="101">201</option>
							</select>
						</dd>
					</dl>
				</div>	
				
				<div class="test_list1">
					<dl>
						<dt>科目</dt>
						<dd>
							<select class="test_list_inner" name="subject">
								<option value="japanese">国語</option>
								<option value="math">数学</option>
							</select>
						</dd>
					</dl>
				</div>
				
				<p class="kensaku">	
					<input class="btn btn-secondary" type="submit" value="検索"</p>
				</p>
			</div>
			<br>
			<div class="test_list_main">
				<div class="test_sub">
					<p>学生情報</p>
				</div>
				<div class="test_list2">
					<dl>
						<dt>学生番号</dt>
						<dd>
							<input type="text" name="no">
						</dd>
					</dl>
				</div>
				<div class="test_list2">
						<input type="submit" value="検索">		
				</div>
			</div>
		</form>
	</section>
</div>
<%@include file="../footer.jsp" %>