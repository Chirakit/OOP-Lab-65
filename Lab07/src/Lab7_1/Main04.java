package Lab7_1;

public class Main04 {
    public static void main(String[] args) {
    CheckingAccount a1 = new CheckingAccount();
    a1.deposit(500);
    System.out.println(a1);
    a1.withdraw(40000.0);
    System.out.println(a1.toString());
    }
}
