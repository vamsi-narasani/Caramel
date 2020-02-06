package connection.mongo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@SuppressWarnings("serial")
public class ShowDetails extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
			
			String ename = request.getParameter("name");
			String eage = request.getParameter("age");
			String edesignation = request.getParameter("designation");
			PrintWriter out = response.getWriter();
			out.print("Thank You");
			Employee object = new Employee();
			
			object.setName(ename);
			object.setAge(eage);
			object.setDesignation(edesignation);
			
			out.println(object.getName());
			out.println(object.getAge());
			out.println(object.getDesignation());
			
			
			
			
			
//			RequestDispatcher rd=request.getRequestDispatcher("EmployeeDao.java");  
//			rd.forward(request, response);//method may be include or forward  
			
			
		}	
}
