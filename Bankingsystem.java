import java.util.*;
class BankAccount 
{
	private String acno;
	private String name;
	private double balance;
	/*static String BankName="SBI";
	static int AcGenerator=10000;*/

	public BankAccount(String name,String acno){
		this.name=name;
		this.acno=acno;
		this.balance=0.0;
	}

	public String getAccountNumber() {
        return acno;
    }

	void deposit(double amount){
		if(amount > 0){
			balance=balance + amount;
		}
		else
		{
			System.out.println("INVALID AMOUNT");
		}
	}

	void withdraw(double amount){
		if(amount > 0 && amount<=balance){
			balance = balance-amount;
			System.out.println("SUCCESSFULLY WITHDRAWL \nCurrent Balance = "+balance);
		}
		else{
			System.out.println("Insufficient Balance \nCurrent Balance = "+balance);
		}
	}

	void checkBalance(){
		System.out.println("Current Balance = "+balance);
	}

	void accountDetails(){
		System.out.println("Account Holder : "+name);
		System.out.println("Account Number : "+acno);
		System.out.println("Current Balance : "+balance);
	} 
}

public class Bankingsystem{

	 private static ArrayList<BankAccount> accounts = new ArrayList<>();

     public static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
     }

		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
           int choice;
        do {
           System.out.println("\n<-- Banking System Menu -->");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    accounts.add(new BankAccount(name, accountNumber));
                    System.out.println("Account created successfully!");
                    break;

                case 2:
					System.out.print("Enter account number: ");
					scanner.nextLine();
                    accountNumber = scanner.nextLine();
					BankAccount account = findAccount(accountNumber);
					if(account != null){
						System.out.print("Enter amount to Deposit: ");
						double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
					}
					else{
						System.out.println("Account not found.");
					}
                    break;

                case 3:
					System.out.print("Enter account number: ");
					scanner.nextLine();
                    accountNumber = scanner.nextLine();
					account = findAccount(accountNumber);
					if(account != null){
						System.out.print("Enter amount to withdraw: ");
						double withdrawAmount = scanner.nextDouble();
						account.withdraw(withdrawAmount);
					}
					else{
						System.out.println("Account not found.");
					}
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    scanner.nextLine(); // Consume newline
                    accountNumber = scanner.nextLine();
                    account = findAccount(accountNumber);
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

				case 5:
					System.out.print("Enter account number: ");
                    scanner.nextLine(); // Consume newline
                    accountNumber = scanner.nextLine();
                    account = findAccount(accountNumber);
                    if (account != null) {
                        account.accountDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
	}
}


