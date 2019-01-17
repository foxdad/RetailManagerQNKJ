<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css" media="all">
<title>查看个人日志</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp" %>
	<%@include file="/jsp/common/sidebar.jsp" %>
<div id="content">
<!--breadcrumbs-->
<!--End-breadcrumbs-->
	<!--Action boxes-->
	<div class="container-fluid">	
    <h1>用户列表</h1>
	<!-- <div class="layui-inline"> 注意：这一层元素并不是必须的
		开始日期：
  		<input type="text" class="layui-input" id="startTime">
  		截止日期
  		<input type="text" class="layui-input" id="endTime">
  		<button class="layui-btn layui-btn-radius layui-btn-normal" id="selectByTime" data-type="reload">搜索</button>
	</div>
	 -->
	<table id="demo" lay-filter="test"></table>
	</div>
	</div>
	<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
	</script>
	
	<script src="${ctx}/statics/layui/layui.js"></script>
	<script>
	layui.use('table', function(){
		  var table = layui.table;
		  
		  //第一个实例
		  table.render({
		    elem: '#demo'
		    ,height: 400
		    ,url: '/RetailManager/selectUserList' //数据接口
		   
		    ,page: true //开启分页
		    ,toolbar : true //开启工具栏
		    ,title : "用户列表" //定义table大标题
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
		      {field: 'id', title: '编号', sort: true, fixed: 'left'}
		      ,{field: 'userName', title: '账号', sort: true}
		      ,{field: 'name', title: '姓名', sort: true}
		      ,{field: 'phone', title: '手机号', sort: true}
		      ,{field:'roleName', title: '角色', width:177,toolbar:"#barDemo"}		      
		    ]]
		  });
			//监听工具条
		  table.on('tool(test)', function(obj){
		    var data = obj.data;
			if(obj.event === 'del'){
		      layer.confirm('确定要删除吗?', function(index){
		    	  $.ajax({
		                url: "/ERP/deletelog",
		                type: "POST",
		                data:{id : data.id},
		                dataType: "text",
		                success: function(index){

		                    if(index=="删除成功"){
		                       //删除这一行
		                        obj.del();
		                       //关闭弹框
		                        layer.close(index);
		                        layer.alert("删除成功！");
		                    }else{
		                    	layer.alert("删除失败！");
		                    }
		                }

		            });
		      	
		      });
		    } else if(obj.event === 'edit'){
		    	$(location).attr('href', '/ERP/userlog?type=1&id='+data.id);
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
	                    	startTime : $("#startTime").val(),
	                    	endTime : $("#endTime").val(),
	                    }
	                });
	            }
	        };
		  
		  //绑定点击事件
	        $('#selectByTime').on('click', function(){
	            var type = $(this).data('type');
	            active[type] ? active[type].call(this) : '';
	        });
		  
		});
	
	layui.use('laydate', function(){
		  var laydate = layui.laydate;
		  
		  //执行一个laydate实例
		  laydate.render({
		    elem: '#startTime' //指定元素
		    ,max: 0
			});
		  laydate.render({
			elem: '#endTime' //指定元素
			,max: 0
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