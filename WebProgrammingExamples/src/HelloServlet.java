import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
  public void doGet (HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException 
{
    response.setContentType ("text/html");
    PrintWriter out = response.getWriter ();
    out.println("<HTML>\n" +"<HEAD><TITLE>Hello World</TITLE></HEAD>\n"+"<BODY>\n" +"<H1>Hello Servlet</H1>\n" +"</BODY></HTML>");
  }
}
