<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/include.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Translated value</title>
</head>
<body>
	<form>
		<h1>Name</h1>
		<%-- <c:out value="${translatedMap}" /> --%>
		<br />
		<!-- <h1>Address</h1>
		<input type="text" name="txtTAddr" /> <br /> -->
		<input type="submit" value="Translate"><br />

		<c:forEach var="map" items="${model}">
			<c:forEach var="str" items="${map.value}">
				<option>
					<c:out value="${str}" />
				</option>
			</c:forEach>
		</c:forEach>
	</form>
</body>
</html>