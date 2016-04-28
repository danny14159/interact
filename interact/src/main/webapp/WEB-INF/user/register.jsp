<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>

输入你的用户名：
<input type="text" id="username"/>
<button onclick="register();">注册</button>

<script type="text/javascript" src="/static/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function register(){
	$.post('',{
		username:$('#username').val()
	},function(data){
		if(data.ok){
			location.href='/chat/room';
		}
		else{
			alert(data.msg);
		}
	},'json')
}
</script>

</body>
</html>