<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
     crossorigin="anonymous">
</head>
<body>
	<%@ include file="navbar.jsp"%>
	    <div class="container">
        <form class="form-control">
            <div class="mb-3 text-center">
              <h3>Total Amount-<span class="amount"><c:out value="${price}"></c:out></span></h3>
        
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label">Customer ID</label>
              <input type="number" name="id" class="form-control" ></input>
            </div>
            <div class="mb-3 ">
            <label for="exampleInputPassword1" class="form-label">Select the payment method</label>
              <select class="form-select form-select-sm" name="mode" aria-label=".form-select-sm example">
                <option value="ONLINEBANKING">ONLINE BANKING</option>
                <option value="CARD">CARD</option>
                <option value="UPI">UPI</option>
                <option value="CASH">CASH</option>
              </select>
            </div>
            <button type="submit" class="order btn btn-primary">Order</button>
          </form>
    </div>
    <script>
        const form=document.querySelector("form")
        form.addEventListener("submit",(e)=>{
            e.preventDefault()
            const amount=document.querySelector(".amount").innerHTML
            const id=form.querySelector("input[name='id']").value
            const mode=form.querySelector("select[name='mode']").value
            
            fetch("/addOrderDetails",{
                method: 'POST',
                headers: {
                    'Content-type': 'application/json'
                },
                body: JSON.stringify({
                    "mode":mode,
                    "total":Number(amount),
                    "customer":{
                        "id":id
                    }      
                })
            })
            .then(res=>res.json())
            .then(data=>{
            	const endpoint="/ordersData?id="+id
                window.location.href=endpoint
            })
            .catch(err=>console.log(err));
        })
    </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
    crossorigin="anonymous"></script>
</body>
</html>