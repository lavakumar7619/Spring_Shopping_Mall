<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>items </h1>
	${users}
	<c:out value="${users}"></c:out>
	<c:forEach items="${users}" var="u">
		
			<c:out value="${u}"></c:out>
		
		
		
	</c:forEach>
</body>
</html>