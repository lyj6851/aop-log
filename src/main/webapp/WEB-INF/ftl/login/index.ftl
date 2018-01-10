<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

<nav class="navbar">
</nav>
<#--主要内容content-->
   <h3>演示登入行为，触发日志记录,请求参数中password将会被隐藏,不被记录</h3>
	<form action="login">
		用户名:<input type="text" name="username" />
		密码：<input type="password" name="password" />
	  	<input type="submit" value="登入" />
	</form>
	<h3>演示登入行为，触发日志记录,请求参数中password将会被隐藏,不被记录</h3>
</div>

<#--js 文件引用-->
<#include "../common/foot.ftl">
<script>

</script>  
</body>
</html>