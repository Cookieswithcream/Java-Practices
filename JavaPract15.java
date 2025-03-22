package javapract15;
import java.util.*;

class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance = 0, amount = 0;
    
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    //setter and getter
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //end of setter and getter
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited RM" + amount);
        System.out.println();
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdraw RM" + amount);
            System.out.println();
        }
        else {
            System.out.println("Insufficient funds! \n Account current balance: RM" + balance);
            System.out.println();
        }
    }
    
    public void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class JavaPract15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double amount = 0, balance = 0;
        int choice;
        String accountHolderName, accountNumber;
        
        
        System.out.println("Please enter your name: ");
        accountHolderName = scan.nextLine();
        
        System.out.println("Please enter your account number: ");
        accountNumber = scan.nextLine();

        BankAccount bank = new BankAccount(accountNumber, accountHolderName, balance);
        
        while(true){
            System.out.println("Please enter choice following (1, 2, 3, 4): ");
            System.out.println("1. Deposit");
            System.out.println("2. WithDraw");
            System.out.println("3. Display Info");
            System.out.println("4. Exit");
            System.out.print(":- ");
            
            if(scan.hasNextInt()){
                choice = scan.nextInt();
                scan.nextLine();
                switch(choice){
                    case 1: { //deposit
                        System.out.print("Please enter the amount to deposit: RM");
                        while(true){
                            if (scan.hasNextDouble()){
                                amount = scan.nextDouble();
                                scan.nextLine();
                                if (amount > 0){
                                    bank.deposit(amount);
                                    break;
                                }
                                else {
                                    System.out.println("Please enter number morethan 0!!");
                                }
                            }
                            else{
                                System.out.println("Please enter numbers!!!");
                                scan.nextLine();
                            }
                        }
                        break;
                    }
                    case 2: { //withdraw
                        System.out.print("Please enter the amount to withdraw: RM");
                        while(true){
                            if (scan.hasNextDouble()){
                                amount = scan.nextDouble();
                                scan.nextLine();
                                if (amount > 0){
                                    bank.withdraw(amount);
                                    break;
                                }
                                else {
                                    System.out.println("Please enter number more than 0!!");
                                }
                            }
                            else{
                                System.out.println("Please enter numbers!!!");
                                scan.nextLine();
                            }
                        }
                        break;
                    }
                    case 3: { //display info
                        bank.displayInfo();
                        break;
                    }
                    case 4: {
                        System.out.println();
                        System.out.println("Exiting...");
                        return;
                    }
                    default: {
                        System.out.println("Please enter valid choice!!!");
                        scan.nextLine();
                    }
                }
            }
            else{
                System.out.println("Please enter the valid choice(numbers)!!!");
                scan.nextLine();
            }
        }
    }
}