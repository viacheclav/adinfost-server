package com.adinfost.main.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MainDaoImpl implements MainDao {

    private final MongoClient mongoClient;

    @Autowired
    public MainDaoImpl(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public List<Document> getInfo() {
        MongoDatabase database = mongoClient.getDatabase("pet");
        MongoCollection<Document> collection = database.getCollection("pets");
        List<Document> documents = collection.find().into(new ArrayList<>());
        documents.forEach(document -> document.remove("_id"));
        return documents;
    }
}
