<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

<nav class="navbar">
</nav>
<#--主要内容content-->
   <div>
    
    <h3>Welcome :${user.username} </h3>
   </div>
<button onclick="logout()">重置密码</button>	
<button onclick="testException()">测试产出异常</button>	
	<form action="logout">
	  	<input type="submit" value="注销" />
	</form>

</div>

<#--js 文件引用-->
<#include "../common/foot.ftl">
<script type="text/javascript">
	$(document).ready(function() {

	});
	function logout() {
		debugger;
		$.ajax({
			url : "resetPassword",
			type:"post",
			contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    data: JSON.stringify({
		    	"username":"ddd",
		    	"password":"333"
		    }),
			success : function(data) {
				alert(data.msg);
			}
		});
	}
	
	function testException() {
		debugger;
		$.ajax({
			url : "testException",
			success : function(data) {
				alert(data.msg);
			},
			failure: function(data) {
				
			}
		});
	}
</script>
</body>
</html>