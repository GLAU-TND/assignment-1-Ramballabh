package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private long phoneNumber;
    List<Long> list = new ArrayList<>();

    public Person() {

    }

    public Person(String fName, String lName, String email, long phoneNumber, List<Long> list) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.list = list;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public List<Long> getList() {
        return list;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }

    private StringBuilder addString() {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (long i : list) {
            sb.append(i);
            k++;
            sb.append((k < list.size() - 1 ? "," : ""));
        }
        return sb;
    }

    @Override
    public String toString() {
        return "-------- * -------- * -------- * --------\n" +
                "First Name: " + fName + "\n" +
                "Last Name: " + lName + "\n" +
                (list.size() == 1 ? "Contact Number: " : "Contact Number(s)") + addString() + "\n" +
                "Email Address: " + email + "\n" +
                "\n-------- * -------- * -------- * --------";
    }
}
