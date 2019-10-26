package model;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoConnection {
    
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        System.out.println("Servidor conectado com sucesso! ");
        
        
        
    }
    
}
