<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="/WebEx01/IMG/kokoko.jpg" width ="50px" />
	<br>
	<a href ="/WebEx01/param?a=10&b=hello">여기를 눌러주세요</a>
	<br>
	<br>
	<br>
	<br>
	<form action="/WebEx01/param" method = "get">
		<input type = "text" name = "a" value=""/>
		<br>
		<br>
		<input type = "text" name = "b" value=""/>
		<br>
		<br>
		<input type = "submit" value="제출"/>
		
	</form>
</body>
</html>