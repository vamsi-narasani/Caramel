import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OriginalServlet extends HttpServlet {
  public void doGet (HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
		  System.out.println ("Inside OriginalServlet ...");
		  response.sendRedirect ("RedirectedToServlet");
  }
}
