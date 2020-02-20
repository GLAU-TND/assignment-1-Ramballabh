package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;
    List<Long> list = new ArrayList<>();

    public Person(String fName, String lName, String email, long phoneNumber, List<Long> list) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.list = list;
    }

}
