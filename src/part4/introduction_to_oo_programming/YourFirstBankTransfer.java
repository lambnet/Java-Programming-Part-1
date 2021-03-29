package part4.introduction_to_oo_programming;

public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account matthews = new Account("Matthews account", 1000);
        Account myAcc = new Account("My account", 0);
        matthews.withdrawal(100.0);
        myAcc.deposit(100.0);

        System.out.println(matthews);
        System.out.println(myAcc);
    }

}
