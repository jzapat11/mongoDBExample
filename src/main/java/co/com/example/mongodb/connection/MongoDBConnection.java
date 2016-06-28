package co.com.example.mongodb.connection;

import com.mongodb.MongoClient;

public class MongoDBConnection {
	
	private static MongoClient mongoClient;
	private static MongoDBConnection mongoDBConnection;
	private static final String MONGO_HOST = "localhost";
	private static final int MONGO_PORT = 27017; 
	
	private MongoDBConnection(){}
	
	public static MongoDBConnection getIntance(){
		
		if(mongoDBConnection == null){
			mongoDBConnection = new MongoDBConnection();
		}
		
		return mongoDBConnection;
		
	}
	
	public MongoClient getConnection(){
		mongoClient = new MongoClient(MONGO_HOST, MONGO_PORT);
		return mongoClient;
	}
}