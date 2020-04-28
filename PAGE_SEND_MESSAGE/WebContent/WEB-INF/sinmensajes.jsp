<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean"
prefix="bean" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Página de aviso</title>
</head>
<body>
	<center>
		<bean:parameter id="usuario" name="nombre"/>
		<h2>El destinatario:<bean:write name="usuario"/>
		no tiene mensajes
		</h2>
	</center>
</body>