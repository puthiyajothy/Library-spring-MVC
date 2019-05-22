<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css"
	integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	</br>
	</br>
	<div class="container">
		<div class="row">
			<div class="col-xs-3">
				<a href="#" class="list-group-item active"> New Classification </a>
				<a href="/librarynew/save" class="list-group-item">Main
					Classification</a> <a href="#" class="list-group-item">Sub
					Classification</a> <a href="#" class="list-group-item">Author</a> <a
					href="#" class="list-group-item">Books</a>
			</div>
			<div class="container">
				<div class="row">
					<div class="col-xs-6">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Classification Id</th>
									<th>Classification Name</th>
									<th>Edit</th>
									<th>Delete</th>
								</tr>
							<tbody>
								<c:forEach items="${classificationList}"
									var="classificationList">
									<tr>
										<th>${classificationList.classificationId}</th>
										<th>${classificationList.classificationName}</th>
										<th><button class="btn btn-primary">Edit</button></th>
										<th><button class="btn btn-danger">Delete</button></th>
									</tr>
								</c:forEach>

							</tbody>

						</table>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>