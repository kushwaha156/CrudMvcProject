<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta charset="ISO-8859-1">
<title>Admin Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
</head>
<body>

	<div class="container mt-5">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Product Name</th>
					<th scope="col">Price</th>
					<th scope="col">Quality</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${products }" var="p" >
				<tr>
					<th scope="row">${p.id }</th>
					<td>${p.productName }</td>
					<td>${p.price }</td>
					<td>${p.quality }</td>
					<td>
						<a href="delete/${p.id}"> <i class='fa fa-trash' style='font-size:24px'></i> </a>
					    <a href="update/${p.id}"> <i class='fas fa-edit' style='font-size:24px'></i> </a> 
					</td>
					
				</tr>
			</c:forEach>	
			</tbody>
		</table>
		<div class="container text-center">
		
			<a href="admin-Page" class="btn btn-outline-success"> ADD </a>
		</div>
	</div>
</body>
</html>