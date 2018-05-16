<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/8/2018
  Time: 8:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read article</title>
</head>
<style>
    #imagecorners {
        border-radius: 25px;
        background: url("https://tpslrq.db.files.1drv.com/y4mWcrv7zsndKXht5cyJcU84hajh4gAfu8mAEqD_xTuZ0lPOx4mrofmHuH2j89IPIF1iFnSvBPt_i820rWJmkQw6Hj6nsxaVIQ3G4jiyxLJ9mRpQYsfTZeLjXmKTE3yUn8ClL8GJrxD2O_-jAeBObEwVwBeViG3l26EtLWIG5DvQjmqvehAr636A4w5jJXtAl7LbCZ1sSnjWzHMn4xCC9xhLA?width=1050&height=567&cropmode=none");
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
        padding: 20px;
        width: 700px;
        height: 350px;
    }

    #pcorners {
        border-radius: 25px;
        border: 2px solid #000000;
        padding: 20px;
        width: 370px;
        height: 520px;
    }

    .container {
        display: flex;
        justify-content: center;
    }

    .center {
        width: 500px;
    }
</style>
<body>


<div class="center">

    <p id="imagecorners"></p>


    <p:set var="article" value="${article}"/>
    <!--<form action = "/viewArticles" method = GET>-->
    <center>
        <table>
            <tr>
                <td><b><h1>${article.title}</h1></b></td>

            </tr>
            <tr>
                <td>${article.author}</td>
            </tr>
            <tr>
                <td>${article.abstractA}</td>
            </tr>
            <tr>
                <td>${article.body}</td>
            </tr>

        </table>

    </center>


    <br/>





</div>

<table id="relatedTable">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>

    </tr>
    <c:forEach var="listaa" items="${lista}">

        <tr>

            <td><c:out value="${listaa.id}"></c:out></td>
            <td>
                <b><a href="/title/${listaa.title}"><c:out value= "${listaa.title}"></c:out></a></b>
            </td>

            <td>
                <c:out value="${listaa.author}"/>
            </td>


        </tr>

    </c:forEach>


</table
</body>
</html>
