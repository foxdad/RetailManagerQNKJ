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
                    <input id="userName" type="text" name="userName" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">密码</label>
                  <div class="controls">
                    <input id="password" type="password" name="password" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">角色</label>
                  <div class="controls">
                  	<select id="roleId" name="roleid" style="width: 221px;">
						<%-- <c:if test="${roleList != null }">
							<option value="0">----请选择----</option>
							<c:forEach var="role" items="${roleList}">
							<option value="${role.roleId}">${role.roleName}</option>
							</c:forEach>
						</c:if> --%>
						<option value="4">管理员</option>
						<option value="5">超级管理员</option>
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

	
	 var userName = $("#userName").val();
	 var password = $("#password").val();
	 var roleId = $("#roleId").val();
	 
	  if(userName == null || userName == ""){
			 layui.use('layer', function(){
				 var layer = layui.layer;
				 layer.msg('请输入姓名');
			 }) 
	  }else if(password == null || password == ""){
		  layer.msg('请输入密码'); 
	  }else if(roleId == null || roleId == 0){
		  layer.msg('请选择部门');
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
			
			$.post('/RetailManager/addAdmin', {
				userName : userName,
            	password : password,
            	roleid : roleId,
			}, function(str){
				  layer.alert(str);
				  alert(str);
				});
	  }	
	    
})
   

</script>
</body>
</html>