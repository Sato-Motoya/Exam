<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../header.jsp" %>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initia-scale=1.0">
    <link rel="stylesheet" href="../css/style.css">
    <title>得点管理システム</title>
</head>
<body>
    
    <h2>科目情報変更</h2>
    
    
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
<%@include file="../footer.jsp" %>