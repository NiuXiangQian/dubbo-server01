<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<script src="${path}/js/jquery-3.3.1.min.js"></script>
<script>
    $(function () {
        $("input[type='button']").click(function () {
            var loginName = $("#loginName").val();
            var password = $("#password").val();
            if (loginName === "" || password === "") {
                $("#hint").html("用户名或者密码不能为空");
            } else {
                $.post("${path}/user/login.do", {
                    "loginName": loginName
                    , "password": password
                }, function (data) {
                    if (data.success) {
                        window.location.href = "${path}/user/success.do";
                    } else {
                        $("#hint").html("用户名或者密码错误");
                    }

                })
            }

        })

    })
</script>
<body>
<center>
    用户名:<input id="loginName"><br/>
    密&nbsp;&nbsp;&nbsp;码:<input type="password" id="password"><br/>
    <span id="hint" style="color: red"></span><br/>
    <input type="button" value="登陆">
</center>
</body>
</html>
