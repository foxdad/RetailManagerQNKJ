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
    <h1>编辑日志</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-pencil"></i> </span>
            <h5>编辑信息</h5>
          </div>
          <div class="widget-content nopadding">
            <form id="form-wizard" class="form-horizontal" method="post" action="#">
              <div id="form-wizard-1" class="step">

                <div class="control-group">
                  <label class="control-label">重要程度</label>
                  <div class="controls">
                  	<select id="workgrade" name="grade" style="width: 221px;">
                  			<option value="${log.grade}" selected = "selected">${log.importance}</option>
							<option value="1">一般</option>
							<option value="2">重要</option>
					</select>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">日志内容</label>
                  <div class="controls">
                  	<textarea id="workdetail" name="detail" rows="5" cols="5">${log.detail}</textarea>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">评价</label>
                  <div class="controls">
                  	<textarea id="assess" name="assess" rows="5" cols="5" readonly="readonly">${log.evaluate}</textarea>
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
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in/">Themedesigner.in</a> </div>
</div>

<!--end-Footer-part-->

<script src="${ctx}/statics/js/excanvas.min.js"></script> 
<script src="${ctx}/statics/js/jquery.min.js"></script> 
<script src="${ctx}/statics/js/jquery.ui.custom.js"></script> 
<script src="${ctx}/statics/js/bootstrap.min.js"></script> 
<script src="${ctx}/statics/js/jquery.flot.min.js"></script> 
<script src="${ctx}/statics/js/jquery.flot.resize.min.js"></script> 
<script src="${ctx}/statics/js/jquery.peity.min.js"></script> 
<script src="${ctx}/statics/js/fullcalendar.min.js"></script> 
<script src="${ctx}/statics/js/matrix.js"></script> 
<script src="${ctx}/statics/js/matrix.dashboard.js"></script> 
<script src="${ctx}/statics/js/jquery.gritter.min.js"></script> 
<script src="${ctx}/statics/js/matrix.interface.js"></script> 
<script src="${ctx}/statics/js/matrix.chat.js"></script> 
<script src="${ctx}/statics/js/jquery.validate.js"></script> 
<script src="${ctx}/statics/js/matrix.form_validation.js"></script> 
<script src="${ctx}/statics/js/jquery.wizard.js"></script> 
<script src="${ctx}/statics/js/jquery.uniform.js"></script> 
<script src="${ctx}/statics/js/select2.min.js"></script> 
<script src="${ctx}/statics/js/matrix.popover.js"></script> 
<script src="${ctx}/statics/js/jquery.dataTables.min.js"></script> 
<script src="${ctx}/statics/js/matrix.tables.js"></script> 
<script src="${ctx}/statics/layer/layer.js"></script>
<script type="text/javascript">
	$("#next").click(function() {
		var grade = $("#workgrade").val();
		var workdetail = $("#workdetail").val();
		if(workdetail == null || workdetail == ""){
			layer.msg("请填写日志");
		}else{
			$.post('/ERP/updatelog', {
				id : "${log.id}",
            	grade : grade,
            	detail : workdetail,
            	type : 1
			}, function(str){
				//layer弹窗回调函数
				  layer.alert(str,function(){
					  $(location).attr('href', '/ERP/jsp/pre/personlog.jsp');
				  });	   				   
				});
		}
	})
</script>	
</body>
</html>