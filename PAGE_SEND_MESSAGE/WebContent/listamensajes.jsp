<%@ page import="javabeans.*,java.util.*"%>
<html>
<head>
<title>Listado de Mensajes</title>
</head>
<body>
<center>
		<h1>
			Mensajes para <%=request.getParameter("nombre")%>
		</h1>
		
		<table border=1>
			<tr><th>Remitente</th><th>Mensaje</th></tr>
			<%ArrayList mensajes= (ArrayList)request.getAttribute("mensajes");
			for(int i=0;i<mensajes.size();i++){
				MensajeForm m=(MensajeForm)mensajes.get(i);%>
			<tr>
				<td><%=m.getRemite()%></td>
				<td><%=m.getTexto()%></td>
			</tr>
			<%}%>
		</table>
		<br/><br/>
		<a href="inicio.jsp">Inicio</a>
</center>
</body>
</html>