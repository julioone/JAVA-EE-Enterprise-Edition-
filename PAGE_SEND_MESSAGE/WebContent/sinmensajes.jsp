<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Página de aviso</title>
</head>
<body>
<center>
<h2>El destinatario:
<%=request.getParameter("nombre")%> no tiene mensajes
</h2>
</center>
</body>
</html>