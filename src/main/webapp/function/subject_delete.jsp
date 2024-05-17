<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>得点管理システム</title>
</head>
<body>
    <h1>科目管理システム</h1>
    <h2>科目情報削除</h2>
    <p><label for="registrationMessage">${name } (${cd })</label></p>
    
    <form action="SubjectDeleteExecute.action" method="post">
    <input type="hidden" name="cd" value=${cd }>
    <input type="hidden" name="name" value=${name }>
    <input type="submit" value="削除">
    <br>
    </form>
    <!-- リンク：一覧に戻る -->
    <a href="subject_list.jsp">戻る</a>
</body>
</html>