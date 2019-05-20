<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">


<title>Insert title here</title>
</head>
<body>


<form:form action="/librarynew/save"  method="post"
modelAttribute="classification">
<h5>Enter New Classification</h5>
		<div class="form-row">
       <div class="col-xs-3">
      <label for="classificationid">Classification </label>
  		<form:input type="text" class="form-control" path="classificationId" />
  		</div>
  		</div>
  		
  		<div class="form-row">
         <div class="col-xs-3">
  		<label for="classificationname">Classification Name</label>
  		<form:input type="text" class="form-control" path="classificationName"/>
  		</div>
  		</div>
  		</br>
  		<div class="form-row">
         <div class="col-xs-3">
  			<input type="submit" class="btn btn-primary" value="submit"/>
  			</div>
  			</div>
      </form:form>
</body>
</html>