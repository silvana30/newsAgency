<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/8/2018
  Time: 11:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>You can add a writer</title>
</head>
<style>

    #pcorners{
        border-radius: 25px;
        border: 2px solid #000000;
        padding: 20px;
        width: 330px;
        height: 520px;
    }

    .container{
        display: flex;
        justify-content: center;
    }
    .center{
        width: 380px;
    }
</style>

<body style="background-color:#00a79d">
<div class = "container">
    <div class ="center">
        <div id="pcorners" align="center">

           <!-- <p id="imagecorners">Log In</p>-->
            <form action = "/adminPage" method = "POST">
                Username: <input type = "text" name = "username"/><br/><br/>
                Password: <input type = "password" name = "password"/><br/><br/>
                <input type = "submit" value = "Register"/>
            </form>
            <br/>
            <a href = "/"><input type = "button" value = "Log Out"/></a>
        </div>
    </div>
</div>

</body>
</html>
