<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/css/select2.css" />
<title>主页</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>	
	<%@include file="/jsp/common/sidebar.jsp"%>
<!--main-container-part-->
<div id="content">
<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
  </div>
<!--End-breadcrumbs-->
	<!--Action boxes-->
	<div class="container-fluid">
		<div class="quick-actions_homepage">
			<ul class="quick-actions">
 				<li class="bg_ls"> <a href="${ctx}/jsp/pre/punch.jsp?userId=${user.userId}"> <i class="icon-tint"></i>打卡</a> </li>
				<!--         <li class="bg_lg span3"> <a href="charts.html"> <i class="icon-signal"></i> Charts</a> </li> -->
				<li class="bg_ly"><a href="widgets.html"> <i
						class="icon-inbox"></i><span class="label label-success">101</span>员工订餐
				</a></li>
				<li class="bg_lo"><a href="tables.html"> <i class="icon-th"></i>通知消息
				</a></li>
				<!--         <li class="bg_ls"> <a href="grid.html"> <i class="icon-fullscreen"></i> Full width</a> </li> -->
				<!--         <li class="bg_lo span3"> <a href="form-common.html"> <i class="icon-th-list"></i> Forms</a> </li> -->
				<!--         <li class="bg_ls"> <a href="buttons.html"> <i class="icon-tint"></i> Buttons</a> </li> -->
				<li class="bg_lb"><a href="${ctx}/jsp/pre/log.jsp"> <i
						class="icon-pencil"></i>填写日志
				</a></li>
				<li class="bg_lg"><a href="calendar.html"> <i
						class="icon-calendar"></i>未读任务（）
				</a></li>
			</ul>
		</div>
		<!--End-Action boxes-->

		<hr />
		<div class="row-fluid">
			<div class="span6">
				<div class="widget-box">
					<div class="widget-title bg_ly" data-toggle="collapse"
						href="#collapseG2">
						<span class="icon"><i class="icon-chevron-down"></i></span>
						<h5>公告通知</h5>
					</div>
					<div class="widget-content nopadding collapse in" id="collapseG2">
						<ul class="recent-posts">
							<li>
								<div class="user-thumb">
									<img width="40" height="40" alt="User" src="${ctx}/statics/images/av1.jpg">
								</div>
								<div class="article-post">
									<span class="user-info"> By: john Deo / Date: 2 Aug 2012
										/ Time:09:27 AM </span>
									<p>
										<a href="#">This is a much longer one that will go on for
											a few lines.It has multiple paragraphs and is full of waffle
											to pad out the comment.</a>
									</p>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div>
			<select name="city" lay-verify="">
			  <option value="">请选择一个城市</option>
			  <option value="010">北京</option>
			  <option value="021">上海</option>
			  <option value="0571">杭州</option>
			</select>
			
			<select id="demo" multiple="multiple" size="3">  
			    <optgroup label="Languages">  
			        <option value="cp">C++</option>  
			        <option value="cs">C#</option>  
			        <option value="oc">Object C</option>  
			        <option value="c">C</option>  
			    </optgroup>  
			    <optgroup label="Scripts">  
			        <option value="js">JavaScript</option>  
			        <option value="php">PHP</option>  
			        <option value="asp">ASP</option>  
			        <option value="jsp">JSP</option>  
			    </optgroup>  
			</select>  
			   
		</div>
	</div>
	<script src="${ctx}/statics/js/jquery.min.js"></script>
	<script src="${ctx}/statics/js/select2.min.js"></script>
<%-- 	<%@include file="/jsp/common/footer.jsp" %> --%>
	<script type="text/javascript">
		$(function(){
			$("select[name='city']").change(function(){
				alert($(this).val());
			})
			
			$("#demo").select2();
		});
	</script>
	
</body>
</html>