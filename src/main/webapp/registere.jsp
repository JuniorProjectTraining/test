<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap 101 Template</title>

<!-- 引入jquery框架 -->
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>

<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
    
    <style type="text/css">
   
	input{
		width:700px!important;
	}

.nn{
font-family:"楷体";
text-align: center;
font-size:20px;
color:cyan;
}

#n {
box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
width: 100px;
height: 150px;
border-radius: 32px;
text-align: center;
border-radius: 5px;
cursor: pointer;
transition: 0.3s;
        }
        
#beijing {
        background-image: url(timg.jpg);
        background-size: 200px 300px;
        background-repeat: no-repeat;
        }
</style>
</head>
<body>

	<div class="container">
	<div id = "beijing">

	<h1 style="text-align: center;"> --- 注册 ---</h1>
	<br>
	<br>


		<form class="form-horizontal" action="${pageContext.request.contextPath}/EmpServlet?cmd=register"
		method="post">
		
		<div id = "dda">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">Nickname</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="nickname"
						placeholder="nickname" name="nickname" onclick="nMsg1()" maxlength="20">
				</div>
				<span id="nicknameSpan"></span>
			</div>
			
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password1"
						placeholder="Password" name="password" onclick="nMsg2()" >
				</div>
				<span id="password1"></span>
			</div>
			
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">againpwd </label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password2"
						placeholder="Password" onclick="nMsg3()" >
				</div>
				<span id="password2"></span>
			</div>
			
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Gender</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="gender"
						placeholder="Gender" name="gender" onclick="nMsg4()" >
				</div>
				<span id="gender"></span>
			</div>
			
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Salary</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="salary"
						placeholder="Salary" name="salary" onclick="nMsg5()" >
				</div>
				<span id="salary"></span>
			</div>
		</div>
			
			<!-- 显示请求域中的信息 -->
			<div style="color: red">
				${requestScope.nicknameMsg }
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-info" >注册</button>
				</div>
			</div>
		
		</form>

	</div>
	<!-- /container -->







	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>

<script type="text/javascript">
	

	// -------------------
	
	/* 当光标放入到nickname的输入框中, 则提示输入信息 */
	function nMsg2(){
		var nSpan2 = document.getElementById("password1");
		
		nSpan2.innerHTML = "<font color='blue'>请输入密码</font>";
	}
	function nMsg3(){
		// alert("点击了nickname输入框");
		
		// 获取对应的span标签, 
		var nSpan3 = document.getElementById("password2");
		
		// 在span标签中显示提示内容
		nSpan3.innerHTML = "<font color='blue'>请再次输入密码</font>";
	}
	function nMsg4(){
		// alert("点击了nickname输入框");
		
		// 获取对应的span标签, 
		var nSpan4 = document.getElementById("gender");
		
		// 在span标签中显示提示内容
		nSpan4.innerHTML = "<font color='blue'>请输入性别</font>";
	}
	function nMsg5(){
		// alert("点击了nickname输入框");
		
		// 获取对应的span标签, 
		var nSpan5 = document.getElementById("salary");
		
		// 在span标签中显示提示内容
		nSpan5.innerHTML = "<font color='blue'>数值</font>";
	}
	
	
</script>

</html>
