<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>填写日志</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>	
	<%@include file="/jsp/common/sidebar.jsp"%>
	
	<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Form elements</a> <a href="#" class="current">Form wizard</a> </div>
    <h1>填写日志</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-pencil"></i> </span>
            <h5>填写信息</h5>
          </div>
          <div class="widget-content nopadding">
            <form id="form-wizard" class="form-horizontal" method="post" action="#">
              <div id="form-wizard-1" class="step">
                <div class="control-group">
                  <label class="control-label">工作标题</label>
                  <div class="controls">
                    <input id="worktitle" type="text" name="worktitle" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">重要程度</label>
                  <div class="controls">
                  	<select id="workgrade" name="grade" style="width: 221px;">
							<option value="1">一般</option>
							<option value="2">重要</option>
					</select>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">日志内容</label>
                  <div class="controls">
                  	<textarea id="workdetail" name="detail" rows="5" cols="5"></textarea>
                  </div>
                </div>               
              </div>
              <div class="form-actions">
                <input id="back" class="btn btn-primary" type="button" value="返回" onclick="javascript:history.go(-1);" />
                <input id="next" class="btn btn-primary" type="button" value="保存" />
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
<script type="text/javascript">
	$("#next").click(function() {
		var title = $("#worktitle").val();
		var workgrade = $("#workgrade").val();
		var workdetail = $("#workdetail").val();
		if(title == null || title == ""){
			layui.use('layer', function(){
				 var layer = layui.layer;
				 layer.msg('请填写标题');
			 })
		}else if(workdetail == null || workdetail == ""){
			layer.msg("请填写日志");
		}else{
			$.post('/ERP/addlog', {
				userId : "${user.userId}",
            	grade : workgrade,
            	detail : workdetail
			}, function(str){
				  layer.alert(str);
				  $(location).attr('href', '/ERP/index');
				});
		}
	})
</script>	
</body>
</html>