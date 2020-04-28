<%@ page import="javabeans.*,java.util.*"%>
<%@ taglib uri=http://struts.apache.org/tags-bean
prefix="bean" %>
<%@ taglib uri=http://struts.apache.org/tags-logic
prefix="logic" %>
<html>
<head>
	<title>Listado de Mensajes</title>
</head>
<body>
	<center>
		<h1>
			<bean:parameter id="usuario" name="nombre"/>
			Mensajes para <bean:write name="usuario" />
		</h1>
		<table border=1>
			<tr><th>Remitente</th><th>Mensaje</th></tr>
			<logic:iterate id="mensa" type="MensajeForm"
			name="mensajes" scope="request">
			<tr>
			<td><bean:write name="mensa" property="remite"/></td>
			<td><bean:write name="mensa" property="texto"/></td>
			</tr>
			</logic:iterate>
		</table>
		<br/><br/>
		<a href="inicio.jsp">Inicio</a>
	</center>
</body>
</html>