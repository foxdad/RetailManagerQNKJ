<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css" media="all">
<title>查看个人请假详情</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp" %>
	<%@include file="/jsp/common/sidebar.jsp" %>
<div id="content">
<!--breadcrumbs-->
<!--End-breadcrumbs-->
	<!--Action boxes-->
	<div class="container-fluid">	
    <h3>员工请假单</h3>
		<div class="control-group">
	        <label class="control-label">姓名</label>
	        <div class="controls">
	        	<input id="userName" type="text" name="userName" />
	    	</div>
	    </div>
	    
	    <div class="form-actions">
            <input id="back" class="btn btn-primary" type="button" value="返回" onclick="javascript:history.go(-1);" />
            <input id="select" class="btn btn-primary" type="button" value="搜索"/>
        	<div id="status"></div>
        </div>
	<table id="demo" lay-filter="test"></table>
	</div>
	</div>
	<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">编辑</a>
	</script>
	
	<script src="${ctx}/statics/layui/layui.js"></script>
	<script>
	layui.use('table', function(){
		  var table = layui.table;
		  
		  //第一个实例
		  table.render({
		    elem: '#demo'
		    ,height: 400
		    ,url: '/ERP/selectLeaveWorks' //数据接口
		    ,where: {userPower : "${user.power01.userPower}"} //接口其他参数
		    ,page: true //开启分页
		    ,toolbar : true //开启工具栏
		    ,title : "员工请假详情" //定义table大标题
		    ,id : "logTables"
		    ,parseData: function(res){ //res 即为原始返回的数据
		        return {
		            "code": 0, //解析接口状态
		            "msg": "", //解析提示文本
		            "count": res.count, //解析数据长度
		            "data": res.data//解析数据列表
		          };
		        }
		    ,cols: [[ //表头
		      {field: 'userName', title: '用户姓名', sort: true, fixed: 'left'}
		      ,{field: 'startTime', title: '请假开始日期', sort: true}
		      ,{field: 'endTime', title: '请假开始日期', sort: true}
		      ,{field: 'status', title: '请假状态', sort: true}
		      ,{field:'right', title: '操作', width:177,toolbar:"#barDemo"}		      
		    ]]
		  });
			//监听工具条
		  table.on('tool(test)', function(obj){
		    var data = obj.data;
			if(obj.event === 'edit'){
		    	$(location).attr('href', '/ERP/toapprove?id='+data.id);
		    }
		  });
		  
		  //搜索加载--数据表格重载
	        var $ = layui.$, active = {
	            reload: function () {
	                //执行重载
	                table.reload('logTables', {
	                    page: {
	                        curr: 1 //重新从第 1 页开始
	                    }
	                    , where: {
	                    	userName : $("#userName").val(),
	                    }
	                });
	            }
	        };
		  
		  //绑定点击事件
	        $('#select').on('click', function(){
	            var type = $(this).data('type');
	            active[type] ? active[type].call(this) : '';
	        });
		  
		});
	
	</script>
<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in/">Themedesigner.in</a> </div>
</div>
<!--end-Footer-part-->
<script src="${ctx}/statics/js/jquery.min.js"></script> 
<script src="${ctx}/statics/js/jquery.ui.custom.js"></script> 
<script src="${ctx}/statics/js/bootstrap.min.js"></script> 
<script src="${ctx}/statics/js/jquery.uniform.js"></script> 
<script src="${ctx}/statics/js/select2.min.js"></script> 
<script src="${ctx}/statics/js/jquery.dataTables.min.js"></script> 
<script src="${ctx}/statics/js/matrix.js"></script> 
<script src="${ctx}/statics/js/matrix.tables.js"></script>	
</body>
</html>