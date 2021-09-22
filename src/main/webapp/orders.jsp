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
<title>Orders-Details</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="rs" dataSource="${db}">SELECT * FROM order_details where  customer_customer_id=<c:out value="${id}"></c:out>;</sql:query>
	<p><strong>Avilable Items Are</strong></p>
      <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">Order_Id</th>
            <th scope="col">Mode</th>
            <th scope="col">Purchased On</th>
            <th scope="col">Total Amount</th> 
             <th scope="col"></th>    
          </tr>
        </thead>
        <tbody>
        <c:forEach items="${rs.rows}" var="row">
          <tr>
            <th scope="row">${row.order_id}</th>
            <td>${row.mode}</td>
            <td>${row.date_of_purchase}</td>
            <td>${row.total}</td>  
            <td><button class="cancel btn btn-outline-danger" data-order="<c:out value='${row.order_id}'></c:out>"> Cancel Order</button></td>        
          </tr>
          </c:forEach>
        </tbody>
      </table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	  <script>
	     const table=document.querySelector("table tbody")
		    table.addEventListener("click",(e)=>{ 
		     	if(e.target.classList[0]=="cancel"){
		        const order_id=e.target.dataset.order;
		        console.log(order_id)
		        const endpoint="/deleteOrder/"+order_id
		        fetch(endpoint,{
		        	method:"DELETE"
		        })
		        .then(res=>res.json())
		        .then(data=>{
		        	if(data==false){
		        		window.location.href="/ordersData"
		        	}
		        	else{
		        	alert("something went wrong")
		        	}
		        })
		        .catch(err=>console.log(err))
		      }
		    })
	   </script>
</body>
</html>