/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
  private double balance;
  private int pin;

  public Main(double balance, int pin) {
    this.balance = balance;
    this.pin = pin;
  }

  public void checkBalance() {
    System.out.println("Your balance is: $" + balance);
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal successful. New balance: $" + balance);
    } else {
      System.out.println("Insufficient funds.");
    }
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit successful. New balance: $" + balance);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your PIN: ");
    int pin = in.nextInt();

    Main atm = new Main(1000, 1234);
    if (atm.pin == pin) {
      System.out.println("Access granted.");
      System.out.println("What would you like to do?");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw");
      System.out.println("3. Deposit");
      System.out.println("4. Exit");
      System.out.print("Enter choice: ");
      int choice = in.nextInt();
      switch (choice) {
        case 1:
          atm.checkBalance();
          break;
        case 2:
          System.out.print("Enter amount to withdraw: ");
          double amount = in.nextDouble();
          atm.withdraw(amount);
          break;
        case 3:
          System.out.print("Enter amount to deposit: ");
          amount = in.nextDouble();
          atm.deposit(amount);
          break;
        case 4:
          System.out.println("Thank you for using this ATM. Have a great day!");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    } else {
      System.out.println("Access denied.");
    }
  }
}