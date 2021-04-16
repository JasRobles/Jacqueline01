<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANCO</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<h1 class="text-center display-1"
	style="font-family: Brush Script MT, arial">
	<font COLOR="black"> BANCO</font>
</h1>
<style type="text/css">
<!--
body {
	background-image:
		url(https://previews.123rf.com/images/peshkova/peshkova1708/peshkova170800949/84565450-resumen-circuito-cerebro-fondo-concepto-de-inteligencia-artificial-representaci%C3%B3n-3d.jpg);
	background-position: center center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

#mail {
	width: 100%;
	position: fixed;
}
-->
</style>


</head>
<body>
	<form action="ControladorAcceso" method="post">
		<label><font COLOR="white">USER</font></label> <br> <input type="text" name="user"
			placeholder="Escribe tu usuario"> <br> <label><font COLOR="white">PASS</font></label>
		<br> <input type="text" name="pass"
			placeholder="Escribe tu password"> <br> <input
			type="submit">
	</form>
</body>
</html>