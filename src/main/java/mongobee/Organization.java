package mongobee;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "organization")
public class Organization {

    private final String name;
    private final String address;

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
