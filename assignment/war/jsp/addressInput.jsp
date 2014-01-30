<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Assignment :: Address Input</title>
</head>
<body>
	<form method="POST" action="../translate.htm">
		<h1>Name</h1>
		<input type="text" name="txtName" /> <br />
		<!-- <h1>Address</h1>
		<input type="text" name="txtAddr" /> <br />  -->
		
		<input type="submit"
			value="Translate"><br />
	</form>

</body>
</html>