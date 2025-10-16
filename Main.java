import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    Account newAcc = new Account(accNum, name, bal);
                    bank.addAccount(newAcc);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    Account acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double dep = sc.nextDouble();
                        acc.deposit(dep);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double wd = sc.nextDouble();
                        acc.withdraw(wd);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNum = sc.nextLine();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        acc.display();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
