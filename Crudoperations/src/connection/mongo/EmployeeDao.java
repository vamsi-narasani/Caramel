package connection.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class EmployeeDao {

	public static void main(String[] args) {
		try
		{
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		DB database = mongo.getDB("Employee");
		DBCollection col = database.getCollection("Details");
		System.out.println("Connection Successful");
		DBCursor cursor=col.find();
		System.out.println(cursor);

		while(cursor.hasNext())
		{
		    System.out.println(cursor.next());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		Employee obj=new Employee();
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getDesignation());
		
	}

}
