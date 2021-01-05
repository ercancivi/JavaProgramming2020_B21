package studingJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankAccount {

    public String accountName;
    public String accountNumber;
    public double availableBalance =0;

    public void setInfo(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;

    }

    public void getInfo() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy, EEEE");
        LocalDate date = LocalDate.now();
        System.out.println( "Date: " + date.format(df) + "\nAccount name: " + accountName + "\nAccount number: "+ accountNumber + "\nAvailable balance: " + availableBalance);
        System.out.println();
    }

    public void deposit(Double amount) {
        availableBalance += amount;
        System.out.println("You did deposit of amount: $" +amount + "\nand your current balance is: " + availableBalance);
        System.out.println();
    }
    public void withdraw(Double amount) {
        availableBalance -= amount;
        System.out.println("You did withdraw of amount: $" +amount + "\nand your current balance is: " + availableBalance);
        System.out.println();
    }

    public void showBalance() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy, EEEE");
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date.format(df) + "and your available Balance = " + availableBalance);
        System.out.println();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", availableBalance=" + availableBalance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setInfo("Jon", "J01");

        account.getInfo();

        account.deposit(300.00);
        account.showBalance();

        account.withdraw(100.00);
        account.showBalance();

        account.deposit(800.00);
        account.withdraw(500.00);
        account.showBalance();

        account.getInfo();

    }

}

class BankOfAmerica {

    public static void main(String[] args) {




    }

}
