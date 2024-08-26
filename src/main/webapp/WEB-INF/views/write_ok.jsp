<jsp:useBean id="article" scope="request" type="com.spring.multiedu.vo.ArticleVO"/>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-08-26
  Time: 오후 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Write Ok</h1>
<ul>
    <li>${article.articleId}</li>
    <li>${article.articleAuthor}</li>
    <li>${article.articleTitle}</li>
    <li>${article.articleContent}</li>
</ul>
</body>
</html>
