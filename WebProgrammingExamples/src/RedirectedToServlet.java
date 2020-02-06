import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RedirectedToServlet extends HttpServlet {
  public void doGet (HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException {
System.out.println ("Inside RedirectedToServlet ...");
         response.setContentType ("text/html");
         PrintWriter out = response.getWriter ();
		      			
    out.println("<HTML>\n" + "<HEAD><TITLE>Hello World</TITLE></HEAD>\n"+ "<BODY>\n" +
		                  "<H1>You have been redirected successfully</H1>\n" +  "</BODY></HTML>");
   }
}
