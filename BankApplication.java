import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Add your bank customer limit: ");
            int size = sc.nextInt();
            String[] accountNames = new String[size];
            double[] accountBalances = new double[size];
            int index = 0;

            while(true) {
                System.out.println("Bank Admin Menu");
                System.out.println("Please enter a Menu Option:");
                System.out.println("(1) Add customer to Bank:");
                System.out.println("(2) Change Customer Name:");
                System.out.println("(3) Check Account Balance:");
                System.out.println("(4) Modify Account Balance:");
                System.out.println("(5) Summary of all acoounts:");
                System.out.println("(-1) Quit");

                int option = sc.nextInt();

                if(option == 1) {
                    System.out.println("Bank Add Customer Menu");
                    System.out.println("Enter the customer's name: ");
                    sc.nextLine();
                    accountNames[index] = sc.nextLine();
                    System.out.println("Enter the customer's deposit: ");
                    accountBalances[index] = sc.nextInt();
                    System.out.println("The Customer ID is: " + index);
                    index++;
                } else if(option == 2) {
                    System.out.println("Bank Change Name Menu");
                    System.out.println("Enter the Customer ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter the customer's new name: ");
                    sc.nextLine();
                    accountNames[id] = sc.nextLine();
                } else if(option == 3) {
                    System.out.println("Bank Check Balance Menu");
                    System.out.println("Enter the Customer ID: ");
                    int id = sc.nextInt();
                    System.out.println("The name of the customer is: " + accountNames[id]);
                    System.out.println("The account balance is: " + accountBalances[id]);
                } else if(option == 4) {
                    System.out.println("Bank Modify Balance Menu");
                    System.out.println("Enter the customer ID: ");
                    int id = sc.nextInt();
                    System.out.println("Press (1) to withdraw and (2) to deposit: ");
                    int userInput = sc.nextInt();
                    if(userInput == 1) {
                        System.out.println("Enter the amount to withdraw: ");
                        accountBalances[id] -= sc.nextDouble();
                    } else if(userInput == 2) {
                        System.out.println("Enter the amount to deposit: ");
                        accountBalances[id] += sc.nextDouble();
                    }
                } else if(option == 5) {
                    System.out.println("Bank Account Summary Menu");
                    double totalBalance = 0;
                    for(int i = 0; i < index; i++) {
                        System.out.println("Customer ID " + i + ": " + accountNames[i] + " has Rs. " + accountBalances[i] + " in his account.");
                        totalBalance += accountBalances[i];
                    }
                    System.out.println("The total amount in the bank is: Rs. " + totalBalance);
                } else if(option == -1){
                    System.exit(-1);
                } else {
                    System.out.println("Invalid entry.");
                    System.out.println("Please try again.");
                }
            }
        }
    }
}