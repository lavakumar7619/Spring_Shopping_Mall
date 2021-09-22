<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eror</title>
</head>
<body>
	<h1>Error try again</h1>
	<c:forEach items="${List}" var="u">
		<tr>
			<%-- <td><c:out value="${u.getId()}"></c:out> </td> --%>
			<c:out value="${u}"></c:out>
		</tr>
		
		
	</c:forEach>
	
	<script type="text/javascript">
		const url=pageContext.request.requestURL
		console.log(url);
	</script>
</body>
</html>