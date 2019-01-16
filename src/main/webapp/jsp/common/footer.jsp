<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--Footer-part-->

<div class="row-fluid">
  <div id="footer" class="span12"> 2013 &copy; Matrix Admin. Brought to you by <a href="http://themedesigner.in/">Themedesigner.in</a> </div>
</div>

<!--end-Footer-part-->

<script src="${ctx}/statics/js/excanvas.min.js"></script> 

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

<script type="text/javascript">
  // This function is called from the pop-up menus to transfer to
  // a different page. Ignore if the value returned is a null string:
  function goPage (newURL) {

      // if url is empty, skip the menu dividers and reset the menu selection to default
      if (newURL != "") {
      
          // if url is "-", it is this page -- reset the menu:
          if (newURL == "-" ) {
              resetMenu();            
          } 
          // else, send page to designated URL            
          else {  
            document.location.href = newURL;
          }
      }
  }

// resets the menu selection upon entry to this page:
function resetMenu() {
   document.gomenu.selector.selectedIndex = 2;
}
</script>
</body>
</html>