layui.use('table', function(){
  var table = layui.table;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: '/ERP/userWorkattendance' //数据接口
    ,where: {userId : 9} //接口其他参数
    ,page: true //开启分页
    ,cols: [[ //表头
      {field: 'userName', title: '用户姓名', sort: true, fixed: 'left'}
      ,{field: 'startTime', title: '上班时间', sort: true}
      ,{field: 'endTime', title: '下班时间', sort: true}
      ,{field: 'nowTime', title: '日期', sort: true}
    ]]
  });
  
});