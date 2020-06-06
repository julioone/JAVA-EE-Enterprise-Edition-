package servlets;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import negocio.*;
import javabeans.*;
public class RegistrarAction extends org.apache.struts.action.Action {
	private final static String SUCCESS = "registrado";
	
	public ActionForward execute(ActionMapping mapping,
	                             ActionForm form, 
	                             HttpServletRequest request,
	                             HttpServletResponse response)
	throws Exception {
		MensajeForm men=(MensajeForm)form;
		//obtiene los parámetros de contexto relativos
		//a la base de datos y crea el objeto del Modelo
		//String driver = this.getServlet().getServletContext().getInitParameter("driver");
		//String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");
		Operaciones oper=new Operaciones();
		oper.registro(men);
		return mapping.findForward(SUCCESS);
	}
}