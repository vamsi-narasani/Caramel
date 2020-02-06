import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CreditCardDetailsServlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		String firstName = request.getParameter ("firstName");
		String middlename= request.getParameter("middle");
		String lastName = request.getParameter ("lastName");
		String cardType = request.getParameter ("cardType");
		String cardnumer= request.getParameter("cardNum");

		response.setContentType ("text/html");
		PrintWriter out = response.getWriter ();

		out.println ("<HTML><HEAD><TITLE>Order Processing</TITLE></HEAD>");
		out.println ("<BODY> <H1> Thank You! </H1>");
		out.println ("Hi " + firstName + " "+ middlename + " " + lastName + "<BR>");

		out.println ("Your credit card is " + cardType);
		out.println ("Your credit card Number is " + cardnumer);

		out.println ("</BODY></HTML");
		out.close ();
	}
}

