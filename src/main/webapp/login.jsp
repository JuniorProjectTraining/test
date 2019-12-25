<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

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
        background-size: 500px 500px;
        
        }
</style>
</head>
<body>
<div id = "beijing">
	<h1 style="text-align: center;">登錄</h1>
	<form style="text-align: center;" action="${pageContext.request.contextPath }/EmpServlet?cmd=login" method="post">
		<input id="nickname" name="nickname" placeholder="用户名" />
		<br>
		<br>
		<input type="password" id="password" name="password" placeholder="密碼" />
		<br>
		<br>
		<input type="submit" value="登錄">
		<input type="submit" value="注册"> 
	</form>
</div>
</body>
</html>