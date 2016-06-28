package co.com.example.mondobd.dao;

import co.com.example.mongodb.connection.MongoDBConnection;
import co.com.example.mongodb.model.User;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class UserDAO {
	
	private static final String DB_NAME = "newbd";
	private static final String COLLECTION_NAME = "users";

	public boolean insertUser(User user){
		MongoClient mongoClient = MongoDBConnection.getIntance().getConnection();
		DB database = mongoClient.getDB(DB_NAME);
		System.out.println("XXXX DATABASE NAME: " + database.getName());
		DBCollection dbCollection = database.getCollection(COLLECTION_NAME);
		System.out.println("XXXX COLLECTION_NAME: " + dbCollection.getName());
		WriteResult result = null;
		try{
			result = dbCollection.insert(user);
		}
		catch(Exception e){
			mongoClient.close();
			System.out.println("XXXX EXCEPTION");
			System.out.println(e.getMessage());
		}
		
		mongoClient.close();
		System.out.println("XXXX INSERTED: " + result.getN());
		if(result.getN() == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public User getUser(String id){
		return null;
	}
}