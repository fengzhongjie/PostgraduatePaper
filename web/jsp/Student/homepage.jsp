<%--
  Created by IntelliJ IDEA.
  User: Fengzhongjie
  Date: 2019/12/18
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>主页 - 学生</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../resources/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../resources/layuiadmin/style/admin.css" media="all">
</head>

<body class="layui-layout-body">

<div id="LAY_app">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <!-- 头部区域 -->
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item layadmin-flexible" lay-unselect>
                    <a href="javascript:;" layadmin-event="flexible" title="侧边伸缩">
                        <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
                    </a>
                </li>
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="http://www.layui.com/admin/" target="_blank" title="前台">
                        <i class="layui-icon layui-icon-website"></i>
                    </a>
                </li>
                <li class="layui-nav-item" lay-unselect>
                    <a href="javascript:;" layadmin-event="refresh" title="刷新">
                        <i class="layui-icon layui-icon-refresh-3"></i>
                    </a>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">

                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="javascript:;" layadmin-event="fullscreen">
                        <i class="layui-icon layui-icon-screen-full"></i>
                    </a>
                </li>
                <li class="layui-nav-item" lay-unselect>
                    <a href="javascript:;">
                        <cite>贤心</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="set/user/info.html">基本资料</a></dd>
                        <dd><a href="set/user/password.html">修改密码</a></dd>
                        <hr>
                        <dd layadmin-event="logout" style="text-align: center;"><a>退出</a></dd>
                    </dl>
                </li>
            </ul>
        </div>

        <!-- 侧边菜单 -->
        <div class="layui-side layui-side-menu">
            <div class="layui-side-scroll">
                <div class="layui-logo" href="home/console.html">
                    <span>学生</span>
                </div>

                <ul class="layui-nav layui-nav-tree" lay-shrink="all" id="LAY-system-side-menu" lay-filter="layadmin-system-side-menu">
                    <li data-name="home" class="layui-nav-item layui-nav-itemed">
                        <a lay-href="javascript:;" lay-tips="主页" lay-direction="2">
                            <i class="layui-icon layui-icon-home"></i>
                            <cite>主页</cite>
                        </a>
                        <dl class="layui-nav-child">
                            <dd data-name="console" class="layui-this">
                                <a lay-href=${pageContext.request.contextPath}/student/getstudentinfo>个人信息</a>
                            </dd>
                            <dd data-name="console" class="layui-this">
                                <a lay-href=#>我的课程</a>
                            </dd>
                        </dl>
                    </li>

                    <li data-name="app" class="layui-nav-item">
                        <a lay-href="javascript:;" lay-tips="学生管理" lay-direction="2">
                            <i class="layui-icon layui-icon-app"></i>
                            <cite>学生管理</cite>
                        </a>
                        <dl class="layui-nav-child">

                            <dd>
                                <a href=#>查看学生选题</a>
                            </dd>
                            <dd>
                                <a href=#>查看选课学生</a>
                            </dd>
                        </dl>
                    </li>
                    <li data-name="senior" class="layui-nav-item">
                        <a lay-href="javascript:;" lay-tips="选题管理" lay-direction="2">
                            <i class="layui-icon layui-icon-senior"></i>
                            <cite>选题管理</cite>
                        </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a lay-href=#>主题详情</a>
                            </dd>
                            <dd>
                                <a lay-href=#>新增主题</a>
                            </dd>

                        </dl>
                    </li>
                    <li data-name="user" class="layui-nav-item">
                        <a href="javascript:;" lay-tips="教师管理" lay-direction="2">
                            <i class="layui-icon layui-icon-user"></i>
                            <cite>教师管理</cite>
                        </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a lay-href=#>网站用户</a>
                            </dd>
                            <dd>
                                <a lay-href=#>后台管理员</a>
                            </dd>
                            <dd>
                                <a lay-href=#>角色管理</a>
                            </dd>
                        </dl>
                    </li>
                    <li data-name="set" class="layui-nav-item">
                        <a href="javascript:;" lay-tips="设置" lay-direction="2">
                            <i class="layui-icon layui-icon-set"></i>
                            <cite>设置</cite>
                        </a>
                        <dl class="layui-nav-child">
                            <dd class="layui-nav-itemed">
                                <a href="javascript:;">系统设置</a>
                                <dl class="layui-nav-child">
                                    <dd><a href=#>网站设置</a></dd>
                                    <dd><a href=#>邮件服务</a></dd>
                                </dl>
                            </dd>
                            <dd class="layui-nav-itemed">
                                <a href="javascript:;">我的设置</a>
                                <dl class="layui-nav-child">
                                    <dd><a href="set/user/info.html">基本资料</a></dd>
                                    <dd><a href="set/user/password.html">修改密码</a></dd>
                                </dl>
                            </dd>
                        </dl>
                    </li>
                    <li data-name="get" class="layui-nav-item">
                        <a href="javascript:;" href="http://www.layui.com/admin/#get" lay-tips="授权" lay-direction="2">
                            <i class="layui-icon layui-icon-auz"></i>
                            <cite>授权</cite>
                        </a>
                    </li>
                </ul>
            </div>
        </div>

        <!-- 页面标签 -->
        <div class="layadmin-pagetabs" id="LAY_app_tabs">
            <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-down">
                <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
                    <li class="layui-nav-item" lay-unselect>
                        <a href="javascript:;"></a>
                        <dl class="layui-nav-child layui-anim-fadein">
                            <dd layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                            <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                            <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
            <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
                <ul class="layui-tab-title" id="LAY_app_tabsheader">
                    <li lay-id="home/console.html" lay-attr="home/console.html" class="layui-this"><i class="layui-icon layui-icon-home"></i></li>
                </ul>
            </div>
        </div>


        <!-- 主体内容 -->
        <div class="layui-body" id="LAY_app_body">
            <div class="layadmin-tabsbody-item layui-show">
                <iframe src="${pageContext.request.contextPath}/teacher/getCourseInfo" frameborder="0" class="layadmin-iframe"></iframe>
            </div>
        </div>

        <!-- 辅助元素，一般用于移动设备下遮罩 -->
        <div class="layadmin-body-shade" layadmin-event="shade"></div>
    </div>
</div>

<script src="../resources/layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: '../resources/layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use('index');
</script>
</body>
</html>
