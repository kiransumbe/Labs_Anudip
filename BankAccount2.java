package lab5;

public interface BankAccount {

	// BankAccount interface
	interface BankAccount {
	    void deposit(double amount);
	    void withdraw(double amount);
	}


	class CheckingAccount implements BankAccount {
	    private double balance;

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	        System.out.println("Current Balance: $" + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	            System.out.println("Current Balance: $" + balance);
	        } else {
	            System.out.println("Insufficient funds. Current Balance: $" + balance);
	        }
	    }
	}


