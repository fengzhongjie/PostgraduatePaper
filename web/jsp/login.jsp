<%--
  Created by IntelliJ IDEA.
  User: Fengzhongjie
  Date: 2019/12/17
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登入 - 研究生论文选读系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../resources/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../resources/layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="../resources/layuiadmin/style/login.css" media="all">
</head>
<body>

<ul class="layui-nav">
    <li class="layui-nav-item">欢迎登录研究生论文选读系统</li>

</ul>

<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

    <div class="layadmin-user-login-main">
        <div class="layadmin-user-login-box layadmin-user-login-header">
            <h2>登录</h2>
            <p>研究生论文选读系统</p>
        </div>
        <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
            <form action="${pageContext.request.contextPath}/user/checkLogin" method="post">
            <div class="layui-form-item">
                <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
                <input type="text" name="username" id="LAY-user-login-username" lay-verify="required" placeholder="学号或教师号" class="layui-input">
            </div>
            <div class="layui-form-item">
                <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
                <input type="password" name="password" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
            </div>

            <div class="layui-form-item">
                <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit">登 入</button>
            </div>


            <div class="layui-trans layui-form-item layadmin-user-login-other">
                 <a href="reg.html" class="layadmin-user-jump-change layadmin-link">注册帐号</a>
             </div>

        </div>
     </div>
</div>
</body>
</html>