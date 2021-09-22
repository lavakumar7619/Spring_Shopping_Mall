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
<title>Items</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	 <% 
		int id=Integer.parseInt(request.getParameter("shop"));
	%> 
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="rs" dataSource="${db}">select * from items where shop_shop_id=<%=id %>;</sql:query>
	<p class="container m-2"><strong>Avilable Items in Shop-<%=id %> are</strong></p>
      <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Category</th>
            <th scope="col">Manufacture Date</th>  
            <th scope="col">Expiray Date</th>
            <th scope="col">Price</th>    
            <th></th>      
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${rs.rows}" var="row">
          <tr>
            <th scope="row">${row.item_id}</th>
            <td>${row.item_name}</td>
            <td>${row.item_category}</td>
            <td>${row.manufacturing_date}</td>
            <td>${row.expiry}</td>
            <td>${row.price}</td>
            <td><button class="buy btn btn-outline-success" data-id="<c:out value='${row.price}'></c:out>">Buy</button></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      
      <script>
		    const table=document.querySelector("table tbody")
		    table.addEventListener("click",(e)=>{
		      if(e.target.classList[0]=="buy"){
		        const total=e.target.dataset.id;
		        const endpoint="/payment?total="+total;
		        window.location.href=endpoint
		      }
		    })
		  </script>
</body>
</html>