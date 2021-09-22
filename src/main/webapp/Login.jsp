<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Login form</title>
</head>
<body>
          <h3 class="text-center text-info text-secondary bg-warning mb-3 p-1">Welcome </h3>
          <div class="container bg-transparent mt-5">
            <h3 class="text-center text-truncate mb-3">Login Form</h3>
            <form class="col needs-validation"  novalidate>
              <div class="mb-3">
                <label for="id" class="form-label">Coustomer ID :</label>
                <input type="text" name="user_id" class="form-control" id="validationCustom01"  required>
                <div class="invalid-feedback">
                  Please Enter Coustomer ID
                </div>
              </div>
              <div class="mb-3">
                <label for="password" class="form-label">password :</label>
                <input type="password" name="password" class="form-control" id="validationCustom02"  required>
                <div class="invalid-feedback">
                  Please Enter The password
                </div>
              </div>            
              <div class="text-center">
                <button class="btn btn-primary" type="submit">Submit form</button>
              </div>
            </form>
      </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
     integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
     crossorigin="anonymous">
    </script>
  <script>

/*     
    (function () {
      'use strict'

      var forms = document.querySelectorAll('.needs-validation')

      // Loop over them and prevent submission
      Array.prototype.slice.call(forms)
        .forEach(function (form) {
          form.addEventListener('submit', function (event) {
            if (!form.checkValidity()) {
              event.preventDefault()
              event.stopPropagation()
            }

            form.classList.add('was-validated')
          }, false)
        })
    })() */
    
    
    const  form= document.querySelectorAll('.needs-validation')[0]
    form.addEventListener('submit',(e)=>{
      e.preventDefault();
      const user_id=form.querySelector('input[name="user_id"]').value;
      const password=form.querySelector('input[name="password"]').value;
     	
      if(user_id.length==0 || password.length==0){
    	  alert("all fields must be filled")
    	  return;
      }
      const endpoint="/getCus/"+user_id
      fetch(endpoint,{
        method:"GET"
      })
      .then(res=>res.json())
      .then(data=>{
    	  console.log(data.user.type)
    	if(data.user.type=="CUSTOMER" && data.user.password==password){
    		window.location.href="/"
    	}
    	else{
    		alert("you are not customer or check your password,try again")
    	} 
      })
      .catch(err=>console.log(err))
    })
  </script>
  </body>
</html>