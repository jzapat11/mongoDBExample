package co.com.example.mondobd.dao;

import co.com.example.mongodb.connection.MongoDBConnection;
import co.com.example.mongodb.model.User;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class UserDAO {
	
	private static final String DB_NAME = "newbd";
	private static final String COLLECTION_NAME = "users";

	public boolean insertUser(User user){
		
		boolean inserted = false;
		MongoClient mongoClient = MongoDBConnection.getIntance().getConnection();
		DB database = mongoClient.getDB(DB_NAME);
		DBCollection dbCollection = database.getCollection(COLLECTION_NAME);
		
		try{
			BasicDBObject document = new BasicDBObject();
			document.put("id", user.getId());
			document.put("name", user.getName());
			document.put("phone", user.getPhone());
			document.put("email", user.getEmail());
			
			dbCollection.insert(document);
			inserted = true;
		}
		catch(Exception e){
			inserted = false;
			mongoClient.close();
		}
		finally{
			mongoClient.close();
		}
		
		return inserted; 
		
	}
	
	public User getUser(String id){
		return null;
	}
}