<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>得点管理システム</title>
</head>
<body>
    <h1>得点管理システム</h1>
    <h2>科目管理</h2>
    <a href="subject_registration.jsp">新規登録</a>
    <table>
        <tr>
            <th>科目コード</th>
            <th>科目名</th>
            
        </tr>
        <c:forEach var ="Subject" items="${list }">
        	<form action="SubjectUpdate.Action" method="post">
			<tr>
			<td>${Subject.cd }<input type="hidden" name="cd" value=${Subject.cd }></td>
			<td>${Subject.name }<input type="hidden" name="name" value=${Subject.name }></td>
         	<td><input type="submit" value="変更"> </td>
         	</form>
         	<form action="SubjectDelete.Action" method="post">
         	<td ><input type="hidden" name="cd" value=${Subject.cd }></td>
			<td ><input type="hidden" name="name" value=${Subject.name }></td>
         	<td><input type="submit" value="削除"></td>
         	</form> 
			</tr>
		</c:forEach>
		                
    </table>
    
</body>
</html>
