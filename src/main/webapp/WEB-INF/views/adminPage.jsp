<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Coding by CodingNepal | www.codingnepalweb.com -->
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="WEB-INF/resources/css/style.css">
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

		<h1>${title }</h1>
		<form action="addProduct" method="post">

			<div class="mb-3">
				<label for="productName" class="form-label">Product Name</label> <input
					type="productName"  name="productName" class="form-control" id=productName>
			</div>
			<div class="mb-3">
				<label for="price" class="form-label">Price</label> <input
					type="price"  name="price" class="form-control" id="price">
			</div>
			<div class="mb-3">
				<label for="quality" class="form-label">Quality</label> <input
					type="quality"  name="quality" class="form-control" id="quality">
			</div>

			<button type="submit" class="btn btn-primary">ADD</button>
		</form>
		<button type="back" class="btn btn-primary">BACK</button>
	</div>

</body>
</html>