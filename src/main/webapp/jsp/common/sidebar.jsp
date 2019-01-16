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
<!--     <li class="active"><a href="index.html"><i class="icon icon-home"></i> <span>首页</span></a> </li> -->
    <li> <a href="${ctx}/jsp/pre/punch.jsp?userId=${user.userId}"><i class="icon icon-signal"></i> <span>打卡</span></a> </li>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>日志管理</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="${ctx}/jsp/pre/log.jsp">填写日志</a></li>
        <li><a href="${ctx}/jsp/pre/personlog.jsp">查看个人日志</a></li>
        <c:if test="${user.power01.userPower > 10}">
        <li><a href="${ctx}/jsp/pre/userlog.jsp">日志评论</a></li>
      	</c:if>
      </ul>
    </li>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>请假处理</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="${ctx}/toaddleave">填写请假单</a></li>
        <li><a href="${ctx}/jsp/pre/personlog.jsp">我的请假详情</a></li>
        <c:if test="${user.power01.userPower > 10}">
        <li><a href="${ctx}/jsp/pre/userlog.jsp">员工请假详情</a></li>
      	</c:if>
      </ul>
    </li>
    <li><a href="tables.html"><i class="icon icon-th"></i> <span>任务信息</span></a></li>
    <li><a href="grid.html"><i class="icon icon-fullscreen"></i> <span>通知</span></a></li>
    <c:if test="${user.power01.userPower > 10}">   
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>员工管理</span> <span class="label label-important">2</span></a>
      <ul>
        <li><a href="${ctx}/toadduser">添加员工</a></li>
        <li><a href="${ctx}/jsp/pre/selectwork.jsp">查看考勤</a></li>
      </ul>
    </li>
    </c:if>
  </ul>
</div>
<!--sidebar-menu-->
	
</body>
</html>