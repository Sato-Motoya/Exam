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
    <!-- 新規登録リンク -->
    <a href="subject_registration.jsp">新規登録</a>
    <form action="SubjectRegistrationServlet" method="post">
        <label for="subjectName">科目名:</label><br>
        <input type="text" id="subjectName" name="subjectName" required><br><br>
        <label for="subjectCode">科目コード:</label><br>
        <input type="text" id="subjectCode" name="subjectCode" required pattern="[A-Za-z0-9]{3}"><br><br>
        <input type="submit" value="登録">
    </form>
</body>
</html>
