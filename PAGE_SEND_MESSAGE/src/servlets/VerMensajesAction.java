package servlets;
import javax.servlet.http.*;
import negocio.*;
import java.util.*;
import org.apache.struts.action.*;

public class VerMensajesAction extends Action{
	private final static String SUCCESS = "mensajes";
	private final static String SINMENSAJES = "nomensajes";
	
	public ActionForward execute(ActionMapping mapping,
	                             ActionForm form,
	                             HttpServletRequest request,
	                             HttpServletResponse response)
	throws Exception {
		//obtiene los parámetros de contexto relativos
		//a la base de datos y crea el objeto del Modelo
		//String driver=this.getServlet().getServletContext().getInitParameter("driver");
		//String cadenacon=this.getServlet().getServletContext().getInitParameter("cadenacon");
		Operaciones oper = new Operaciones();
		//recupera los mensajes asociados al destinatario
		ArrayList mensajes= oper.getMensajes(request.getParameter("nombre"));
		if(mensajes==null || mensajes.size()==0){
			return mapping.findForward(SINMENSAJES);
		}
		else{
			request.setAttribute("mensajes",mensajes);
			return mapping.findForward(SUCCESS);
		}
	}
}