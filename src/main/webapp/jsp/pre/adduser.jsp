<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css" media="all">
<title>添加员工</title>
</head>
<body>
<%@include file="/jsp/common/header.jsp"%>
<%@include file="/jsp/common/sidebar.jsp"%>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Form elements</a> <a href="#" class="current">Form wizard</a> </div>
    <h1>员工添加</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-pencil"></i> </span>
            <h5>填写信息</h5>
          </div>
          <div class="widget-content nopadding">
            <form id="form-wizard" class="form-horizontal" method="post">
              <div id="form-wizard-1" class="step">
                <div class="control-group">
                  <label class="control-label">用户名</label>
                  <div class="controls">
                    <input id="username" type="text" name="username" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">密码</label>
                  <div class="controls">
                    <input id="password" type="password" name="password" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">重复密码</label>
                  <div class="controls">
                    <input id="password2" type="password" name="password2" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">部门</label>
                  <div class="controls">
                  	<select id="department" name="department" style="width: 221px;">
						<c:if test="${departmentList != null }">
							<option value="0">----请选择----</option>
							<c:forEach var="department" items="${departmentList}">
							<option value="${department.departmentId}">${department.departmentName}</option>
							</c:forEach>
						</c:if>
					</select>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">职位</label>
                  <div class="controls">
                    <select id="power" name="power" style="width: 221px;">
						<c:if test="${pList != null }">
							<option value="0">----请选择----</option>
							<c:forEach var="power" items="${pList}">
							<option value="${power.powerId}">${power.powerName}</option>
							</c:forEach>
						</c:if>
					</select>
                  </div>
                </div>                
              </div>
              <div class="form-actions">
                <input id="back" class="btn btn-primary" type="button" value="返回" onclick="javascript:history.go(-1);" />
                <input id="adduser" class="btn btn-primary" type="button" value="添加"/>
                <div id="status"></div>
              </div>
              <div id="submitted"></div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--Footer-part-->
<%@include file="/jsp/common/footer.jsp" %>
<script src="${ctx}/statics/layui/layui.js"></script>
<script type="text/javascript">
$("#adduser").click(function(){
	 var username = $("#username").val();
	 var password = $("#password").val();
	 var password2 = $("#password2").val();
	 var department = $("#department").val();
	 var power = $("#power").val();
	 
	  if(username == null || username == ""){
			 layui.use('layer', function(){
				 var layer = layui.layer;
				 layer.msg('请输入姓名');
			 }) 
	  }else if(password == null || password == ""){
		  layer.msg('请输入密码'); 
	  }else if(password2 != password){
		  layer.msg('两次密码不一致'); 
	  }else if(department == null || department == 0){
		  layer.msg('请选择部门');
	  }else if(power == null || power == 0){
		  layer.msg('请选择职位');
	  }else{
// 			$.ajax({
// 	            type: "POST",
// 	            url: "/ERP/adduser",
// 	            data: {
// 	            	username : username,
// 	            	password2 : password2,
// 	            	department : department,
// 	            	power : power		          		
// 	            },
// 	            dataType: "text",
// 	            success: function(data){
// 	            	alert(data);
// 					$(location).attr('href', '/ERP/index');
// 	            }
// 	        });
			
			$.post('/ERP/adduser', {
				username : username,
            	password2 : password2,
            	department : department,
            	power : power
			}, function(str){
				  layer.alert(str);
				});
	  }	
	    
})
   

</script>
</body>
</html>