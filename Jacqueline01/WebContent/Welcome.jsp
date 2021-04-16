<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>
<h1>WELCOME</h1>
<script type="text/javascript">

$(document).ready(function () {

	$.post('ControladorAcceso', {
		//Enviar informacion

	}, function (response) {
		//Recibir informacion

		let datos = JSON.parse(response);
		console.log(datos);

		var tabla = document.getElementById('tablausuario');
		for (let item of datos) {

			tabla.innerHTML += `
	 <tr>
		<td> ${item.idUsuario} </td>
	    <td> ${item.Usuario} </td>
	    <td> ${item.PassWord}</td>
	    <td> ${item.tipoUsuario}</td>
	</tr>
`
		}
	});
});

</script>

	<table class="table table-dark" id="tablausuario">
  
  <tbody>
    <tr class="table-active">
    
    <tr>
      <th>IDUSUARIO</th>
	  <th>USUARIO</th>
	  <th>PASSWORD</th>
	  <th>TIPOUSUARIO</th>
    </tr>
  </tbody>
</table>

</body>
</html>