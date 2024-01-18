<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding by CodingNepal | www.codingnepalweb.com -->
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<title>Update</title>

<!-- Boxicons CDN Link -->
<link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css'
	rel='stylesheet'>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
</head>
<body>


	<div class="container mt-5 ">

		<h1>${title } </h1>
		<form action="${pageContext.request.contextPath }/addProduct" method="post">
			<input type="text" value="${product.id }" name="id"></input>
			<div class="mb-3">
				<label for="productName" class="form-label">Product Name</label> <input
					type="productName" name="productName" class="form-control"
					id=productName  value="${product.productName}">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label">Price</label> <input
					type="price" name="price" class="form-control" id="price"  value="${product.price}" >
			</div>
			<div class="mb-3">
				<label for="quality" class="form-label">Quality</label> <input
					type="quality" name="quality" class="form-control" id="quality" value="${product.quality}">
			</div>

			<button type="submit" class="btn btn-primary">Update</button>
		</form>
		<button type="back" class="btn btn-primary">BACK</button>
	</div>

</body>
</html>