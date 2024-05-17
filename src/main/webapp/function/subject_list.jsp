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
			<tr>
			<td>${Subject.cd }</td>
			<td>${Subject.name }</td>
         	<td><a href="subject_update.jsp">変更</a>  <a href="subject_delete.jsp">削除</a></td>
			</tr>
		</c:forEach>
		                
    </table>
    
</body>
</html>
