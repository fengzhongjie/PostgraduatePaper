<%--
  Created by IntelliJ IDEA.
  User: Fengzhongjie
  Date: 2019/12/19
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>主页 - 教师</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../resources/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../../resources/layuiadmin/style/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">教师信息</div>
                <div class="layui-card-body">
                    <table class="layui-table">
                        <colgroup>
                            <col width="150">
                            <col width="150">
                            <col width="150">
                            <col width="200">
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>姓名</th>
                            <th>性别</th>
                            <th>部门</th>
                            <th>联系方式</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>${teacher.name}</td>
                            <td>${teacher.sex}</td>
                            <td>${teacher.protitle}</td>
                            <td>${teacher.phone}</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
</div>
</div>



</body>
</html>