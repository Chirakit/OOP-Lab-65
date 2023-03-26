package more;
public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
//3000.0 baht is withdrawn from Somsri01.
//3000.0 baht is deposited to Somsri02.
//Somsri Boonjing has 2 account.
//Somsri01 account has 2000.0 baht.
//Somsri02 account has 6000.0 baht.