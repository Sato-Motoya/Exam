<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    
    <h2>科目情報登録</h2>
    
    <form action="SubjectRegistrationServlet" method="post">
            <!-- 科目コード入力フォーム -->
        <label for="subjectCode">科目コード:</label><br>
        <input type="text" id="subjectCode" name="cd" required pattern="[A-Za-z0-9]{3}"><br><br>
    
        <!-- 科目名入力フォーム -->
        <label for="subjectName">科目名:</label><br>
        <input type="text" id="subjectName" name="name" required><br><br>
                
        <!-- 登録ボタン -->
        <input type="submit" value="登録"><br><br>
        
        <!-- 戻るリンク -->
        <a href="subject_list.jsp">戻る</a>
    </form>
</body>
</html>
<%@include file="../footer.jsp" %>