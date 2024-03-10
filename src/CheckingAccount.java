public class CheckingAccount extends BankAccount {
    private final double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            super.withdrawal(amount);
            System.out.println("Overdraft fee: $30");
            System.out.println("Transaction successful with overdraft fee.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds for overdraft.");
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}
