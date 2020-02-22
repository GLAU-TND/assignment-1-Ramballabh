package person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
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
            sb.append((k <= list.size() - 1 ? "," : ""));
            sb.append(" ");
        }
        return sb;
    }
    @Override
    public String toString() {
        return "-------- * -------- * -------- * --------\n" +
                "First Name: " + fName + "\n" +
                "Last Name: " + lName + "\n" +
                (list.size() == 1 ? "Contact Number: " : "Contact Number(s):") + addString() + "\n" +
                "Email Address: " + email + "\n" +
                "-------- * -------- * -------- * --------";
    }

    @Override
    public int compareTo(Person person) {
        return fName.compareTo(person.fName);

    }

    public boolean equals(Person person) {
      /*  int n=this.fName.compareTo(person.fName);
        if(n==1){
            return true;
        }
        else if(n==0 || n==-1){
            return false;
        }
        return true;
    */
        //return (fName.compareToIgnoreCase(person.fName))>=1;
        return fName.equals(person.fName);
    }
}
