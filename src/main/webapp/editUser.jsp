<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
     crossorigin="anonymous">
<title>Edit User</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="row" dataSource="${db}">select * from customer where customer_id=<c:out value="${id}"></c:out>;</sql:query>
	 <div class="container">
    <h1 class="text-center">Edit User profile</h1>
    <form class="form-control">
     <c:forEach items="${rs.rows}" var="row">
        <div class="mb-3">
          <label for="Email" class="form-label">Email address</label>
          <input type="email" class="form-control" name="email" value="<c:out value="${row.email}"></c:out>" aria-describedby="emailHelp">
          <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
          <label for="name" class="form-label">Name</label>
          <input type="text" class="form-control" value="<c:out value="${row.name}"></c:out>" name="name">
        </div>
        <div class="mb-3">
            <label for="phno" class="form-label">Phone Number</label>
            <input type="number" class="form-control" value="<c:out value="${row.phone}"></c:out>" name="phno">
        </div>        
       <div class="mb-3 text-center">
        <button type="submit" class= "btn btn-success">Update</button>
       </div>
      </form>
       </c:forEach>
</div>

<script>
    const form=document.querySelector("form")
    form.addEventListener('submit',(e)=>{
        e.preventDefault();
        const name=form.querySelector("input[name='name']").value
        const email=form.querySelector("input[name='email']").value
        const phno=form.querySelector("input[name='phno']").value

        fetch("/editCus",{
            method: 'PUT',
            headers: {
                'Content-type': 'application/json'
            },
            body: JSON.stringify({
                "id":1,
                "email":email,
                "name":name,
                "phone":phno,
                "user":{
                    "id":1,
                    
                }   
            })
        })
        .then(res=>res.json())
        .then(data=>{
            console.log(data);
            alert("updated Succesfully")
            window.location.href="/editUser"
        })
        .catch(err=>console.log(err))
        
    })
</script>
</body>
</html>