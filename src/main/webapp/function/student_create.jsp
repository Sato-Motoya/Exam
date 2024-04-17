<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>


<%--学生情報の入力をここでさせる（未完成）--%>
<form action="StudentCreate.action" method="post">

<p>学生番号<input type="text" name="no"></p>
<p>氏名<input type="text" name="no"</p>
<p>入学年度<input type="text" name="ent-year"></p>
<p>クラス番号<input type="text" name="class-num"></p>
<%--出席はinputではなく選択にする予定↓ --%>
<p>出席<input type="text" name="is-attend"></p>

</form>

<%@include file="../footer.html" %>








<p><input type="submit" value="登録"</p>
</from>

<%@include file="../footer.html" %>