<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Signup</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
     crossorigin="anonymous">
</head>
<body>
	<div class="container">
        <h1 class="text-center">Cutomer Register</h1>
        <form class="form-control">
            <div class="mb-3">
              <label for="Email" class="form-label">Email address</label>
              <input type="email" class="form-control" name="email" aria-describedby="emailHelp">
              <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" name="name">
            </div>
            <div class="mb-3">
                <label for="phno" class="form-label">Phone Number</label>
                <input type="number" class="form-control" name="phno" >
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" name="password">
            </div>
            <div class="mb-3">
                <label for="type" class="form-label">Type</label>
                <select class="form-select form-select-sm" name="type" aria-label=".form-select-sm example">
                    <option value="CUSTOMER" >Customer</option>
                    <option value="SHOPOWNER" disabled>Shop Owner</option>
                    <option value="ADMIN" disabled>Admin</option>
                  </select>
            </div>
            
           <div class="mb-3 text-center">
            <button type="submit" class= "btn btn-primary">Submit</button>
           </div>
          </form>
    </div>

    <script>
        const form=document.querySelector("form")
        form.addEventListener('submit',(e)=>{
            e.preventDefault();
            const name=form.querySelector("input[name='name']").value
            const email=form.querySelector("input[name='email']").value
            const password=form.querySelector("input[name='password']").value
            const phno=form.querySelector("input[name='phno']").value
            const type=form.querySelector("select[name='type']").value
            
            fetch("/addCus",{
                method: 'POST',
                headers: {
                    'Content-type': 'application/json'
                },
                body: JSON.stringify({
                    "email":email,
                    "name":name,
                    "phone":phno,
                    "user":{
                        "name":name,
                        "password":password,
                        "type":type
                    }       
                })
		        })
		        .then(res=>res.json())
		        .then(data=>{
		            console.log(data);
		            window.location.href="/login"
		        })
		        .catch(err=>console.log(err))
            
        })
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
    crossorigin="anonymous"></script>
</body>
</html>