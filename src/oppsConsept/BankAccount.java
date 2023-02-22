package oppsConsept;

public class BankAccount {

	
	String firstName;
	String lastName;
	String phone;
	String email;
	String accountNum;
	double balance;
	
	public BankAccount() {
		firstName="";
		lastName="";
		phone="";
		accountNum="";
		balance =0;
	}
	
	public BankAccount (String firstName, String lastName,String phone,String email,String accountNum,double balance) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.phone= phone;
		this.email=email;
		this.accountNum=accountNum;
		this.balance=balance;
	}
	

// checking balance method  
	// it should print a message with account info  
	// it should return the balance value  
	public double checkBalance() {
    System.out.println("Account#: " + accountNum + " Full Name: " + firstName + " " + lastName                + " - Current balance: $" + balance);
    return balance;
}
// deposit method  
	// this function should accept a double value and then add it to the balance
// this function should print a confirmation message  
	// it should return current balance on the account   
	public double deposit(double amount) {
    balance += amount;
    System.out.println("A deposit of $" + amount + " was successfuly made! Your " + "Currect Balance $" + balance);
    return balance;
}
// withdraw method   
	// this method should accept amount, it should then check the balance   
	// if amount requested is <= balance   
	
	// return the amount withdrawn, print a confirmation message  
	// reduce the balance by the amount   
	// if amount requested is not <= balance   
	// print a message that says " Insufficient Balance! "   
	// return 0   
	public double withdraw(double amount) {
    if (amount <= balance) {
        balance -= amount;
        System.out.println("Withdraw of amount $" +            amount + " successful! - current balance: $" + balance);
        return amount; 
    } else {
        System.out.println("Insufficient Balance!");
        return 0;
    }
}
// transfer met
}


