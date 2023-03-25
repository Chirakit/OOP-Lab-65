public class Main01 {
    public static void main(String[] args) {
        Account a1 = new Account(5000, "Sommai");
        Account a2 = new Account(3000, "Somchai");
        Account a3 = new Account(900, "Somsri");

        Bank myBank = new Bank();
        myBank.addAccount(a1);
        myBank.addAccount(a2);
        myBank.addAccount(a3);

        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        System.out.println("Deposit 500...");
        myBank.getAccount(0).deposit(500);
        myBank.getAccount(0).showAccount();
        System.out.println("Show all accounts");
        System.out.println("==============================");
        for(int i=0; i<myBank.getNumAccount(); i++){
        myBank.getAccount(i).showAccount();
        }
    }
}
//Number of Account: 3
//Sommai account has 5000.0 baht.
//Deposit 500...
//500.0 baht is deposited to Sommai.
//Sommai account has 5500.0 baht.
//Show all accounts
//==============================
//Sommai account has 5500.0 baht.
//Somchai account has 3000.0 baht.
//Somsri account has 900.0 baht.