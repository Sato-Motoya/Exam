<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>

<p>成績参照</p>
<form>
	<h5>科目情報</h5>
	<h5>入学年度</h5><br>
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
	
	<h5>クラス</h5><br>
		<select name="class">
			<option value="101">101</option>
			<option value="201">131</option>
			<option value="101">201</option>
		</select>
		
	<h5>科目</h5><br>
		<select name="subject">
			<option value="japanese">国語</option>
			<option value="math">数学</option>
		</select>
		
	<p><input type="submit" value="検索"</p>
	
	
	
	
	<h5>学生情報</h5>
	<h5>学生番号</h5>
	<p><input type="text" name="no"></p>
	<p><input type="submit" value="検索"</p>
</form>

<%@include file="../footer.html" %>