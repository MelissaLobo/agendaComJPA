<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<h1>Adicionar contato:</h1>
	<form action="http://localhost:8080/salvar" method="POST">
		Nome: <input type="text" name="nome"> 
		Telefone: <input type="text" name="telefone"> 
		<input type="submit" value="Salvar">
	</form>
	
<a href="http://localhost:8080/site/menu.jsp">Inicio</a><br/>
</body>
</html>

