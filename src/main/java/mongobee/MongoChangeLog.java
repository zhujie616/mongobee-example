package mongobee;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeLog
public class MongoChangeLog {

    @ChangeSet(order = "001", id = "addGeorgeUser", author = "lyashenko")
    public void addGeorgeUser(DB db) {
        final DBCollection users = db.getCollection("users");
        final BasicDBObject doc = new BasicDBObject().append("name", "George");
        users.insert(doc);
    }

    @ChangeSet(order = "002", id = "addOrganizations", author = "lyashenko")
    public void addOrganizations(MongoTemplate mongoTemplate) {
        final Organization organization = new Organization("orgName", "Saint-Petersburg, Gorohovaya 23");
        mongoTemplate.save(organization);
    }

}
