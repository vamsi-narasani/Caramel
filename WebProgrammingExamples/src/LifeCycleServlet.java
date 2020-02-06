
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LifeCycleServlet extends HttpServlet {

	  
	  public void init () {
	  	System.out.println ("In init () method");
	  }
	  
	  public void doGet (HttpServletRequest request,
	                    HttpServletResponse response) throws IOException {
	                    
	  	System.out.println ("In doGet () method");
	  	PrintWriter out = response.getWriter();
	  	out.println("Servlet Life Cycle");
	  }
	 public void destroy () {
	  	  	System.out.println ("In destroy () method");
	  }	  
}     
