package connection.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Connectiontomongo {

	public static void main(String[] args) throws Exception {
		try
		{
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		DB database = mongo.getDB("Employee");
		DBCollection col = database.getCollection("Details");
		System.out.println("Connection Successful");
		DBCursor cursor=col.find();
		System.out.println(cursor);
		BasicDBObject object = new BasicDBObject();
		object.put("name","Vamsi");
		object.put("age","28");
		object.put("Designation","Engineer");
		col.insert(object);
		
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
