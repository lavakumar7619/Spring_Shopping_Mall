<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Home</title>
</head>
<body class="bg-info"> 
	<%@ include file="navbar.jsp"%>
	<h2 class="text-center">Avilable Services Are As Follows</h2>
	<div class="container mb-3 text-centre">
     	<button type="button" class="btn btn-success m-5 ml-0" data-bs-toggle="modal" data-bs-target="#staticBackdrop">All Users</button>
     	<button type="button" class="btn btn-warning m-5 ml-0" >Search By Mall ID</button>
     	<button type="button" class="btn btn-success m-5 ml-0" >Search By ItemName</button>
     	<button type="button" class="btn btn-warning m-5 ml-0" >Search Shop</button>
		<!-- Modal -->
		<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
		  <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="staticBackdropLabel">All Avilable Users</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <div class="modal-body">				
		        <table class="table table-hover">
			        <thead>
			          <tr>
			            <th scope="col">User ID</th>
			            <th scope="col">Name</th>
			            <th scope="col">Type</th>    
			          </tr>
			        </thead>
			        <tbody>
			        <c:forEach items="${users}" var="u">
			          <tr>
			            <th scope="row">${u.id}</th>
			            <td>${u.name}</td>
			            <td>${u.type}</td>
			          </tr>
			          </c:forEach>
			        </tbody>
      			</table>
		      </div>
		    </div>
		  </div>
		</div>
    </div>	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		 crossorigin="anonymous"></script>
		<script>
		    var myModal = document.getElementById('myModal')
		    var myInput = document.getElementById('myInput')
		
		    myModal.addEventListener('shown.bs.modal', function () {
		      myInput.focus()
		    })
		</script>
 		
</body>
</html>