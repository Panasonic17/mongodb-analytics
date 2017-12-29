import com.mongodb.*;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


import java.net.UnknownHostException;
import java.util.Set;

/**
 * Created by Oleksandr_Shainoga on 12/29/2017.
 */
public class test {
    public static void main(String[] args) throws UnknownHostException {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://" + HidenData.login + ":" + HidenData.pass + "@mflix-ankqa.mongodb.net/test");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("mflix");
        ListCollectionsIterable<Document> collectionsIterable = database.listCollections();
        for (Document d : collectionsIterable) {
            System.out.println("asd");
            System.out.println(d);
        }
    }
}
