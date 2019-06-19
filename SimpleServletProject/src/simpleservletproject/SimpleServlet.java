package simpleservletproject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 * @param <PrintWriter>
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet<PrintWriter> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * Default constructor. 
     */
    public SimpleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		java.io.PrintWriter out = response.getWriter();
		 
		out.println("Hello Awarna");
		
		
	}

	/**
	 * @param session 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object session) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    java.io.PrintWriter out = response.getWriter();
	    String userName = request.getParameter("userName");
	    String fullName = request.getParameter("fullName");
	    request.getParameter("prof");
	    String location = request.getParameter("location");
	    request.getSession();
	    out.println( userName +"---------------"+ fullName+"-------"+location);
	}
}
	

