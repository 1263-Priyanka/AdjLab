package links;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("li");
		
		if(value.equals("svecw")) {
			//out.println("addition operation by servlet 1");
			response.sendRedirect("http://www.svecw.edu.in/");
		}
		else if(value.equals("svecw exams")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.svecwexams.in/");
		}
		else if(value.equals("codetantra")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://svecw.codetantra.com/");
		}
		else if(value.equals("google classroom")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.google.com/search?q=google+classroom&rlz=1C1CHBF_enIN814IN814&oq=google+cla&aqs=chrome.0.69i59j69i57j0l2j69i60l3j69i65.6828j0j7&sourceid=chrome&ie=UTF-8");
		}
		else if(value.equals("vishnupay")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://vishnupay.in/");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
