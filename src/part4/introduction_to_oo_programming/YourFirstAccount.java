package part4.introduction_to_oo_programming;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account firstAcc = new Account("Alvian", 100);
        Account secondAcc = new Account("Nur",100);
        firstAcc.deposit(20);
        secondAcc.withdrawal(14.7);
        System.out.println(firstAcc.toString());
    }
}
