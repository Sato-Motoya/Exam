<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<h1>得点管理システム</h1>
<h5>君<a href="../login-logout/logout-in.jsp">ログアウト</a></h5>

<%@include file="menu.jsp" %>

<h3>学生管理</h3>


<form>
	<p>入学年度<br>
		<select name="ent-year">
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
		
	<br>

	クラス<br>
		<select name="class">
			<option value="101">101</option>
			<option value="201">131</option>
			<option value="101">201</option>
		</select>
		
		<br>
		
		<input type="checkbox" name="is-attend" value="在学中">在学中

<br>

<input type="submit" value="送信する"
</p>

</form>

<p>検索結果:〇件
<%--一覧表示未完成 --%>

<%@include file="../footer.html" %>



