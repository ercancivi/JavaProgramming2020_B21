package studingJava.day41_Tasks;

    /*
    create custom class called BankAccount for Bank of America

            public variables:  bankName, firstName, lastName

            private variables: accountHolder, accountNumber, balance

            encapsulate all the private data
                    (DO NOT USE SHORTCUT)

            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)

            public methods:
                    deposit
                    withdraw
                    availableBalance
     */

import java.util.Locale;

public class BankAccount {

    public final static String bankName = "Bank Of America";

    public String firstName, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAccountNumber(accountNumber);
        setAccountHolder(firstName, lastName);
    }

    public void setAccountHolder(String firstName, String lastName) {
        accountHolder = firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount : $" + amount);
        }

        System.out.println("Depositing $" + amount + " to " + accountNumber);
        setBalance(balance+amount);
    }

    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Not enough balance");
            return;
        }

        System.out.println("Withdrawing $" + amount + " from " + accountNumber);
        setBalance(balance - amount);
    }

    public void availableBalance() {
        System.out.println("Account number# " + accountNumber + " and " + accountHolder + "' available balance is $" + getBalance());
    }


}
