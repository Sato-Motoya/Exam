<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>得点管理システム</title>
</head>
<body>
    <h1>得点管理システム</h1>
    <h2>科目情報登録</h2>
    
    <form action="SubjectRegistrationServlet" method="post">
        <!-- 科目名入力フォーム -->
        <label for="subjectName">科目名:</label><br>
        <input type="text" id="subjectName" name="subjectName" required><br><br>
        
        <!-- 科目コード入力フォーム -->
        <label for="subjectCode">科目コード:</label><br>
        <input type="text" id="subjectCode" name="subjectCode" required pattern="[A-Za-z0-9]{3}"><br><br>
        
        <!-- 登録ボタン -->
        <input type="submit" value="登録"><br><br>
        
        <!-- 戻るリンク -->
        <a href="list.jsp">戻る</a>
    </form>
</body>
</html>
