<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css" media="all">
<title>填写请假单</title>
</head>
<body>
<%@include file="/jsp/common/header.jsp"%>
<%@include file="/jsp/common/sidebar.jsp"%>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Form elements</a> <a href="#" class="current">Form wizard</a> </div>
    <h1>填写请假单</h1>
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
                  <label class="control-label">开始时间</label>
                  <div class="controls">
                    <input id="startTime" type="text" name="startTime" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">结束时间</label>
                  <div class="controls">
                    <input id="endTime" type="text" name="endTime" />
                  </div>
                </div>
               
                <div class="control-group">
                  <label class="control-label">请假类型</label>
                  <div class="controls">
                  	<select id="type" name="type" style="width: 221px;">
						<c:if test="${leavetypes != null }">
							<option value="0">----请选择----</option>
							<c:forEach var="leavetype" items="${leavetypes}">
							<option value="${leavetype.typeId}">${leavetype.typeName}</option>
							</c:forEach>
						</c:if>
					</select>
                  </div>
                </div>               
              </div>
              <div class="form-actions">
                <input id="back" class="btn btn-primary" type="button" value="返回" onclick="javascript:history.go(-1);" />
                <input id="addleave" class="btn btn-primary" type="button" value="添加"/>
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
layui.use('laydate', function(){
	  var laydate = layui.laydate;
	  
	  //执行一个laydate实例
	  laydate.render({
	    elem: '#startTime' //指定元素
	  });
	  laydate.render({
		elem: '#endTime' //指定元素
	  });
	});


$("#addleave").click(function(){
	 var startTime = $("#startTime").val();
	 var endTime = $("#endTime").val();
	 var type = $("#type").val();
	 
	  if(startTime == null || startTime == ""){
			 layui.use('layer', function(){
				 var layer = layui.layer;
				 layer.msg('请填写开始日期');
			 }) 
	  }else if(endTime == null || endTime == ""){
		  layer.msg('请填写结束日期'); 
	  }else if(type == null || type == 0){
		  layer.msg('请选择请假类型');
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
			
			$.post('/ERP/addleave', {
				userId : "${user.userId}",
				startTime : startTime,
				endTime : endTime,
				type : type
			}, function(str){
				  layer.alert(str,function(){
					  $(location).attr('href', '/ERP/index');
				  });
				});
	  }	
	    
})
   

</script>
</body>
</html>