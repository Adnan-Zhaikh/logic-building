package practical;
public class BankAccount {
    private int balance= 1000;
    private void showBalance(){
        System.out.println("Balance =" + balance);
    }
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.showBalance();
    }
}