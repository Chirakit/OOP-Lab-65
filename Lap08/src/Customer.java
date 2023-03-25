public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer(){
        this("", "");
        acct = new Account[5];
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    public int getNumOfAccount(){
        return numOfAccount;
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
