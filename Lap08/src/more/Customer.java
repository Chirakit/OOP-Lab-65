package more;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public Customer(){
        this("", "");
        acct = new ArrayList();
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public Account getAccount(int index){
        return (Account)acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String toString(){
        if (acct == null) {
            return this.firstName + " " + this.lastName + " doesn’t have account.";
        }
        else {
            return this.firstName + " " + this.lastName + " has " + getNumOfAccount() + " account.";
        }
    }
}

