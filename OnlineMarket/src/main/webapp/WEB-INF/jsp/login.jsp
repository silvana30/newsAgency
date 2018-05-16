<%--
  Created by IntelliJ IDEA.
  User: silva
  Date: 5/8/2018
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
</head>
<style>

    #imagecorners{
        border-radius: 25px;
        background: url("https://tpsnrq.db.files.1drv.com/y4mrmvvF61iw-QET3W5-q8xKVX3E7kbMucOYTP_pXJbuiN3u9efmWOIyo9_0lA0zBvVqVkJT9kjFCqgG3KiTu-vh0MOqa-luLYQfU8CoXVJfvSkj0qwK-TuJHC5XoPXWjCQ1fpbH_-ejG9BGVtQ78zURuTWEy4uV-rOdzVnBNDJxGk1FjYbAqyBRRkuT0EXKgyUN63CKmxJC4tpI30n9v5KRg?width=225&height=225&cropmode=none");
        background-position:center;
        background-repeat: no-repeat;
        background-size: cover;
        padding:20px;
        width:300px;
        height:280px;
    }

    #pcorners{
        border-radius: 25px;
        border: 2px solid #000000;
        padding: 20px;
        width: 370px;
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
            <p id="imagecorners"></p>
            <form action = "/loginPage" method = "POST">
                Username: <input type = "text" name = "username"/><br/><br/>
                Password: <input type = "password" name = "password"/><br/><br/>
                <input type = "submit" value = "Login"/>
            </form>

        </div>
    </div>
</div>

</body>
</html>
