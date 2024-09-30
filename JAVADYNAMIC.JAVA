import java.util.Scanner;

class Bank {
    float acbal = 10000;
    Scanner scannerObj = new Scanner(System.in);

    public void withdraw() {
        System.out.println("Please enter multiples of 100");
        int wamt = scannerObj.nextInt();
        if (wamt % 100 == 0) {
            if (wamt <= acbal) {
                acbal -= wamt;
                System.out.println("Available balance: " + acbal);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please enter multiples of 100");
        }
    }

    public void deposit() {
        System.out.println("Please enter amount (multiples of 100)");
        int damt = scannerObj.nextInt();
        if (damt % 100 == 0) {
            if (damt <= 100000) {
                acbal += damt;
                System.out.println("Available balance: " + acbal);
            } else {
                System.out.println("Deposit limit is 100000 only");
            }
        } else {
            System.out.println("Please enter multiples of 100");
        }
    }

    public void viewOptions() {
        System.out.println("Welcome to ABC Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("Enter your option from the above given options");
        int option = scannerObj.nextInt();
        if (option == 1) {
            deposit();
        } else if (option == 2) {
            withdraw();
        } else {
            System.out.println("Invalid option, please try again.");
        }
    }

    public void validate() {
        int pin = 1234; // database

        System.out.println("Enter your pin number");
        int userpin = scannerObj.nextInt();
        if (pin == userpin) {
            viewOptions();
        } else {
            System.out.println("Invalid pin");
        }
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.validate();
    }
}
