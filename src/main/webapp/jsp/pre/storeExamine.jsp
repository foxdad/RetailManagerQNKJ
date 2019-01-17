<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/layui/css/layui.css"
	media="all">
<title>查看个人日志</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar.jsp"%>
	<div id="content">
		<!--breadcrumbs-->
		<!--End-breadcrumbs-->
		<!--Action boxes-->
		<div class="container-fluid">
			<h1>店铺表</h1>
			<div class="layui-inline">
				<!-- 注意：这一层元素并不是必须的 -->
				<form class="layui-form" action="">
						店铺名:
						<input type="text" name="storeName" placeholder="请输入店铺名">
						店主姓名:
						<input type="text" name="ownerName" placeholder="请输入店主姓名">
					<button class="layui-btn layui-btn-radius layui-btn-normal"
						id="selectByName" data-type="reload">搜索</button>
				</form>
			</div>

			<table id="demo" lay-filter="test"></table>
		</div>
	</div>
	<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
	</script>

	<script src="${ctx}/statics/layui/layui.js"></script>
	<script>
		layui.use('table', function() {
			var table = layui.table;

			//第一个实例
			table.render({
				elem : '#demo',
				height : 400,
				url : '/RetailManager/getStorePage' //数据接口
				,
				where : {} //接口其他参数
				,
				page : true //开启分页
				,
				toolbar : true //开启工具栏
				,
				title : "个人日志表" //定义table大标题
				,
				id : "logTables",
				parseData : function(res) { //res 即为原始返回的数据
					return {
						"code" : 0, //解析接口状态
						"msg" : "", //解析提示文本
						"count" : res.count, //解析数据长度
						"data" : res.data
					//解析数据列表
					};
				},
				cols : [ [ //表头
				{
					field : 'storeName',
					title : '店铺名',
					sort : true,
					fixed : 'left'
				}, {
					field : 'ownerName',
					title : '店主姓名',
					sort : true
				}, {
					field : 'storeType',
					title : '店铺类型',
					sort : true
				}, {
					field : 'shzt',
					title : '审核状态',
					sort : true
				}, {
					field : 'right',
					title : '操作',
					width : 177,
					toolbar : "#barDemo"
				} ] ]
			});

			//搜索加载--数据表格重载
			var $ = layui.$, active = {
				reload : function() {
					//执行重载
					table.reload('logTables', {
						page : {
							curr : 1
						//重新从第 1 页开始
						},
						where : {
							storeName : $("#storeName").val(),
							ownerName : $("#ownerName").val(),
						}
					});
				}
			};

			//绑定点击事件
			$('#selectByTime').on('click', function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});

		});

		// 	layui.use('laydate', function(){
		// 		  var laydate = layui.laydate;

		// 		  //执行一个laydate实例
		// 		  laydate.render({
		// 		    elem: '#storeName' //指定元素
		// 		    ,max: 0
		// 			});
		// 		  laydate.render({
		// 			elem: '#ownerName' //指定元素
		// 			,max: 0
		// 			});
		// 		});

		layui.use('form', function() {
			var form = layui.form;
		});
	</script>
	<div class="row-fluid">
		<div id="footer" class="span12">
			2013 &copy; Matrix Admin. Brought to you by <a
				href="http://themedesigner.in/">Themedesigner.in</a>
		</div>
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