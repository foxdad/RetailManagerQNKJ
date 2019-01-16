<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/css/uniform.css" />
<link rel="stylesheet" href="${ctx}/statics/css/select2.css" />
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css" media="all">
<title>打卡签到</title>

</head>
<body>
	
	<%@include file="/jsp/common/header.jsp"%>	
	<%@include file="/jsp/common/sidebar.jsp" %>
<!--main-container-part-->
<div id="content">
<!--breadcrumbs-->
  <div id="content-header">
    <div id="breadcrumb"> <a href="${ctx}/index" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
  </div>
<!--End-breadcrumbs-->
	<!--Action boxes-->
	<div class="container-fluid">
		<div class="quick-actions_homepage">
			<ul class="quick-actions">
				<li class="bg_lb"><a href="#" id="gowork"> <i
						class="icon-pencil"></i>上班签到</a>
				</li>
 				<li class="bg_ls"> <a href="#" id="offwork"> <i class="icon-tint"></i>下班打卡</a> </li>
			</ul>
		</div>
		<hr/>
	<h5>个人考勤表</h5>	
	
	
	<div class="layui-inline"> <!-- 注意：这一层元素并不是必须的 -->
		开始日期：
  		<input type="text" class="layui-input" id="startTime">
  		截止日期
  		<input type="text" class="layui-input" id="endTime">
  		<button class="layui-btn layui-btn-radius layui-btn-normal" id="selectByTime" data-type="reload">搜索</button>
	</div>
	
	<table id="demo" lay-filter="test"></table>
 
	<script src="${ctx}/statics/layui/layui.js"></script>
	
	<script>
	layui.use('table', function(){
		  var table = layui.table;
		  
		  //第一个实例
		  table.render({
		    elem: '#demo'
		    ,height: 400
		    ,url: '/ERP/userWorkattendance' //数据接口
		    ,where: {userId : "${user.userId}"} //接口其他参数
		    ,page: true //开启分页
		    ,toolbar : true //开启工具栏
		    ,title : "个人考勤表" //定义table大标题
		    ,id : "userTables"
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
		      ,{field: 'startTime', title: '上班时间', sort: true}
		      ,{field: 'endTime', title: '下班时间', sort: true}
		      ,{field: 'nowTime', title: '日期', sort: true}
		    ]]
		  });
		  
		  //搜索加载--数据表格重载
	        var $ = layui.$, active = {
	            reload: function () {
	                //执行重载
	                table.reload('userTables', {
	                    page: {
	                        curr: 1 //重新从第 1 页开始
	                    }
	                    , where: {
	                    	beginTime : $("#startTime").val(),
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
			
		<div class="form-actions">
        	<input id="back" class="btn btn-primary" type="button" value="返回" onclick="javascript:history.go(-1);" />
        </div>		
		<!--End-Action boxes-->
		<hr />
	</div>
	
	<!--Footer-part-->
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
<script type="text/javascript">
	$("#gowork").click(function(){
		layui.use('layer', function(){
			 var layer = layui.layer;
		})
		
		$.post('/ERP/gowork', {
				userId : "${user.userId}"
			}, function(str){
				  layer.alert(str,function(){
					  $(location).attr('href', '/ERP/jsp/pre/punch.jsp');
				  });
				});
	})
	
		$("#offwork").click(function(){
		layui.use('layer', function(){
			 var layer = layui.layer;
		})
		
		$.post('/ERP/offwork', {
				userId : "${user.userId}"
			}, function(str){
				  layer.alert(str,function(){
					  $(location).attr('href', '/ERP/jsp/pre/punch.jsp');
				  });
				});
	})
</script>	
</body>
</html>