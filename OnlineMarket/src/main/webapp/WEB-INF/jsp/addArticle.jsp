<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/9/2018
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
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


</style>
<head>
    <title>Add article</title>
</head>
<body>
<div class="topnav">
    <a class="active" href="/writerPage/addArticle">Add Article</a>
    <a href="/writerPage/update">Update</a>
    <a href="/writerPage/delete">Delete</a>
    <a href="/writerPage/viewArticles">View articles</a>
    <a href="/writerPage/logout">Logout</a>
</div>
<br/><br/>

<!-- <p id="imagecorners">Log In</p>-->
<form action="/writerPage/addArticle/add" method="POST">

    Title: <input type="text" name="title"/><br/><br/>
    Author: <input type="text" name="author"/><br/><br/>
    Abstract: <input type="text" name="abstractA"/><br/><br/>
    Body: <input type="text" name="body"/><br/><br/>
    Add related article: <input type="text" name="related"/><br/><br/>

    <input type="submit" value="Add article"/>
</form>

</body>
</html>
