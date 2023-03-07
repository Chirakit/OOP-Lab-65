package Lab7_1;

public class Main02 {
    public static void main(String[] args) {
        Account a1 = new Account(50000, "61070033");
        a1.showAccount();
        a1.deposit(500);
        a1.showAccount();
        a1.withdraw(40000);
        a1.showAccount();
    }
}
