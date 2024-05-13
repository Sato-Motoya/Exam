<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>得点管理システム</title>
</head>
<body>
    <h1>得点管理システム</h1>
    
    <c:if test="${not empty errorMessage}">
        <p style="color: red">${errorMessage}</p>
    </c:if>
    
    <form action="UpdateSubjectAction" method="post">
        
        
        
        <label for="subjectName">科目名:</label>
        <input type="text" id="subjectName" name="subjectName" value="${subject.name}" required><br><br>
        
        <label for="subjectCode">科目コード:</label>
        <input type="text" id="subjectCode" name="subjectCode" value="${subject.code}" required pattern="[A-Za-z0-9]{3}"><br><br>
        
        <input type="submit" value="更新">
        <br>
        <a href="subject_list.jsp">戻る</a>
    </form>
</body>
</html>
