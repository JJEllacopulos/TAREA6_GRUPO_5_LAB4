<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	
	<a href="Pantalla_Inicio.jsp"> Inicio </a>
	<a href="Pantalla_agregar_seguro.jsp"> Agregar seguro </a>
	<a href="Pantalla_listar_seguros.jsp"> Listar seguros </a>
	
	<br><br>
	<h2> <b> Agregar seguros </b> </h2>
	<br><br>
	
	<form action="Pantalla_agregar_seguro.jsp" method="post"  >
		
		Id seguro <%= %><br> 
		Descripcion <input type="text" name="txt_Descripcion">  <br>
		Tipo de seguro  <select name = "ddl_tipo_seguro"></select> <br>
		Costo contratacion <input type="text" name="txt_cost_contratacion"> <br>
		Costo maximo asignado <input type="text" name="txt_cost_max_asignado"> <br>
		<input type="submit" value="Aceptar" name="btnAceptar">
		
	</form>
	
	
	
</body>
</html>