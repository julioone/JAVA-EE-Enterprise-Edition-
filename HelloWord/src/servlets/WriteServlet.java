package servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;
import beans.ModelEJB;
import beans.MessageException;
/**
 * Servlet implementation class WriteServlet
 */
@WebServlet(name = "/WriteServlet", urlPatterns = {"/WriteServlet"})
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private ModelEJB ModelEJB;
	private static String PUT_MESSAGE = "put_message";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = request.getParameter(PUT_MESSAGE);
		if ("".equals(message)) {
			ModelEJB.deleteMessage();
		} 
		else {
			try {
				ModelEJB.putUserMessage(message);
			} 
			catch (MessageException nme) {
				throw new ServletException(nme);
			}
		}
		response.sendRedirect("./DisplayServlet");
	}
}
