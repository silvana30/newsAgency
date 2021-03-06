<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/8/2018
  Time: 2:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<style>
    body {
        background-color: #00a79d;
    }

    .topnav {
        background-color: #333;
        overflow: hidden;
    }

    /* Style the links inside the navigation bar */
    .topnav a {
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
    }

    /* Change the color of links on hover */
    .topnav a:hover {
        background-color: #ddd;
        color: black;
    }

    /* Add a color to the active/current link */
    .topnav a.active {
        background-color: #82E7D7;
        color: black;
    }

    #prodTable {
        border-collapse: collapse;
        width: 70%;
        align: center;
    }

    #prodTable td, #prodTable th {
        border: 1px solid #ddd;
        padding: 8px;
        background-color: lightblue;
    }

    #prodTable th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #7FB8AF;
        color: #0E433B;
    }

    .button1 {
        border: none;
        color: white;
        padding: 16px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 12px;
        margin: 4px 2px;
        -webkit-transition-duration: 0.4s;
        transition-duration: 0.4s;
        cursor: pointer;
    }

    .subButton {
        background-color: white;
        color: black;
        border: 2px solid #008CBA;
    }

    .subButton:hover {
        background-color: #008CBA;
        color: white;
    }

</style>
<head>
    <title>View articles</title>
</head>
<body>
<div class="topnav">
    <a href="/writerPage/addArticle">Add Article</a>
    <a href="/writerPage/update">Update</a>
    <a href="/writerPage/delete">Delete</a>
    <a class="active" href="/writerPage/viewArticles">View articles</a>
    <a href="/writerPage/logout">Logout</a>

</div>

<br/><br/>


<table id="articlesTable">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>

    </tr>
    <c:forEach var="article" items="${articles1}">

        <tr>
            <td><c:out value="${article.id}"/></td>


            <td>
                <c:out value="${article.title}"/></td>

            <td>
                <c:out value="${article.author}"/>
            </td>


        </tr>

    </c:forEach>


</table>

<!--</form>-->
</body>
</html>
