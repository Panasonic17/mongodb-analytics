import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;

/**
 * Created by Oleksandr_Shainoga on 12/29/2017.
 */
public class test {
    public static void main(String[] args) throws UnknownHostException {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://"+HidenData.login+":"+HidenData.pass+"@mflix-ankqa.mongodb.net/test");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");
    }
}
