<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

	<%--  <% 
		int id=Integer.parseInt(request.getParameter("id"));
	%> --%>
	
	<c:set var="id" scope="application" value="1"></c:set>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="rs" dataSource="${db}">SELECT * FROM customer where customer_id=<c:out value="${id}"></c:out> </sql:query>
 
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
          <a class="navbar-brand" >Welcome ,<c:forEach items="${rs.rows}" var="row">${row.email}</c:forEach></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="/shops">Shops</a>
              </li>
              <li class="nav-item" >
                <a class="nav-link active" href="/ordersData">Orders</a>
              </li>
            </ul>
                <a class="btn bg-success" href="/editUser">Profile</a>
                <button class="btn bg-warning" id="logout">Logout</button>
          </div>
        </div>
      </nav>
       <script>
       		const logout=document.querySelector('#logout')
       		logout.addEventListener('click',(e)=>{
                fetch("/logout")
                .then(data=> data.json())
                .then(res=>{
                	if(res==false){
                		window.location.href='/login'
                	}
                	else{
                		alert("try again")
                		return;
                	}
                })
                .catch((err)=>console.log(err))
           })
       
       </script>