public class TestBanking {
    public static void main(String[] args) {
        // Test BankAccount
        BankAccount account = new BankAccount("John", "Doe", 12345);
        account.deposit(1000);
        account.withdrawal(500);
        account.accountSummary();

        System.out.println("--------------------------");

        // Test CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("Jane", "Smith", 67890, 0.02);
        checkingAccount.deposit(2000);
        checkingAccount.processWithdrawal(2500);
        checkingAccount.displayAccount();
    }
}
