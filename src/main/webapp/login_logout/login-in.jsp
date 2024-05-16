<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.jsp" %>
<%@include file="../function/menu.jsp" %>

<form action="Login.action" method="post">
<p>ログイン名<br><input type="text" name="name"></p>
<p>パスワード<br><input type="password" name="password"></p> 
<p><input type="submit" value="ログイン"></p>
</form>

<%@include file="../footer.jsp" %>