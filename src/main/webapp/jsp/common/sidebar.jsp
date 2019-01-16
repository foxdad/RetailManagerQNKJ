<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--start-top-serch-->

<!--close-top-serch-->
<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
  <ul>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>用户管理</span> <span class="label label-important">2</span></a>
      <ul>
        <li><a href="${ctx}/jsp/pre/addAdmin.jsp">添加管理员</a></li>
        <li><a href="${ctx}/selectUserList">查看用户列表</a></li>
      </ul>
    </li>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>商家信息</span> <span class="label label-important">2</span></a>
      <ul>
        <li><a href="${ctx}/toaddleave">商家列表</a></li>
        <li><a href="${ctx}/jsp/pre/personlog.jsp">店铺审核</a></li>
      </ul>
    </li>
    <li><a href="tables.html"><i class="icon icon-th"></i> <span>任务信息</span></a></li>
    <li><a href="grid.html"><i class="icon icon-fullscreen"></i> <span>通知</span></a></li>
  </ul>
</div>
<!--sidebar-menu-->
	
</body>
</html>