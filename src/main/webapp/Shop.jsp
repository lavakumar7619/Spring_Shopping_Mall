<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Shops</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="rs" dataSource="${db}">SELECT * FROM shop ORDER BY category DESC;</sql:query>
	<p><strong>Avilable Shops in MALL</strong></p>
      <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">Category</th>
            <th scope="col">Shop Name</th>
            <th scope="col">Status</th>
            <th scope="col"></th>        
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${rs.rows}" var="row">
          <tr>
            <th scope="row">${row.category}</th>
            <td>${row.shop_name}</td>
            <td>${row.status}</td>
            <c:choose>
				<c:when test="${row.status=='OPEN'}">
					<td><button class="enter btn btn-outline-success" data-id="<c:out value='${row.shop_id}'></c:out>">Enter</button>
					</td>
				</c:when>
				<c:otherwise><td><button class="btn btn-outline-danger" disabled>Closed</button></td></c:otherwise>
			</c:choose>
          </tr>
          </c:forEach>
        </tbody>
      </table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	 integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
	 crossorigin="anonymous"></script>
	  <script>
	     const table=document.querySelector("table tbody")
		    table.addEventListener("click",(e)=>{ 
		     	if(e.target.classList[0]=="enter"){
		        const shop_id=e.target.dataset.id;
		        const endpoint="items?shop="+shop_id
		        window.location.href=endpoint;
		      }
		    })
	   </script>
</body>
</html>