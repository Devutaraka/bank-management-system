import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account created successfully!");
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        for (Account acc : accounts) {
            acc.display();
        }
    }
}
