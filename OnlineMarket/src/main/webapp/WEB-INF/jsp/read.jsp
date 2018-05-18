<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/8/2018
  Time: 2:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Read articles</title>
</head>
<style>
    body {
        background-color: #00a79d;
    }

    .topnav {
        background-color: #333;
        overflow: hidden;
    }

    .topnav a {
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
    }


</style>
<body>
<div class="topnav"><a href="/login">LOG IN</a></div>
<br/><br/>
<h1>Read articles</h1>
<table id="articlesTable">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>

    </tr>
    <c:forEach var="article" items="${articles}">

        <tr>
            <td><c:out value="${article.id}"></c:out></td>


            <td>
                <b><a href="/title/${article.title}"><c:out value="${article.title}"/></a></b></td>
            </td>
            <td>
                <c:out value="${article.author}"/>
            </td>
            <!--<td>
                <c:out value="${article.abstractA}"/>
            </td>
            <td>
                <c:out value="${article.body}"/>
            </td>-->

        </tr>

    </c:forEach>

    <!--${json}-->

</table>


</body>
</html>
