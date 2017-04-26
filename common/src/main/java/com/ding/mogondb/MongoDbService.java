package com.ding.mogondb;

import com.mongodb.*;
import org.springframework.stereotype.Component;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Gurongjing on 2017/4/26.
 */

@Component
public class MongoDbService {
    static final private Logger _logger = Logger.getLogger(MongoDbService.class
            .getName());

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine engine = sem.getEngineByName("javascript");

    private MongoClient mongo;

    public void setMongo(MongoClient mongo) {
        this.mongo = mongo;
    }

    public MongoClient getMongo(){
        return mongo;
    }

    /**
     * 初始化mogondb
     */
    @javax.annotation.PostConstruct
    public void init() {
        try {
            mongo = new MongoClient("192.168.10.5",
                    27017);
            String username = "";
            String password = "";
            //mongo.getDB("ding").authenticate(username, password.toCharArray());
        } catch (Exception ex) {
            _logger.log(Level.SEVERE, ex.getMessage());
            throw new RuntimeException(ex.getMessage());
        }
    }

    // public createDatabase;

    /**
     * 创建数据库
     *
     * @param databaseName 数据库
     * @throws Exception
     */
    public DB createDatabase(String databaseName) throws Exception {
        return mongo.getDB(databaseName);
    }

    public DB getDatabase(String databaseName) throws Exception {
        return mongo.getDB(databaseName);
    }

    /**
     * 删除数据库
     *
     * @param databaseName 数据库
     * @throws Exception
     */
    public void dropDatabase(String databaseName) throws Exception {
        mongo.dropDatabase(databaseName);
    }

    /**
     * 创建集合
     *
     * @param databaseName   数据库
     * @param collectionName 集合
     * @return DBCollection
     * @throws Exception
     */
    public DBCollection createCollection(String databaseName,
                                         String collectionName) throws Exception {
        return getDatabase(databaseName).getCollection(collectionName);
    }


    /**
     * 获取集合
     *
     * @param databaseName   数据库
     * @param collectionName 集合
     * @return DBCollection
     * @throws Exception
     */
    private DBCollection getCollection(String databaseName,
                                       String collectionName) throws Exception {
        return getDatabase(databaseName).getCollection(collectionName);
    }

    /**
     * 创建索引默认为hash
     * @param databaseName
     * @param collectionName
     * @param indexName
     */
    public void createIndex(String databaseName,
                            String collectionName,String indexName) throws Exception{
        if(indexName != null && !indexName.isEmpty()) {
            BasicDBObject index = new BasicDBObject();
            index.append(indexName, "hashed");
            getDatabase(databaseName).getCollection(collectionName).createIndex(index);
        }
    }

    public void insert(String databaseName, String collectionName,BasicDBObject userDocument){

        try {
            getCollection(databaseName, collectionName).insert(userDocument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
