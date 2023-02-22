package oppsConsept;

public class TesterforBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount user1 =new BankAccount();
		
		BankAccount user2=new BankAccount("ana", "David", "2232323232","ssaa@gmail.com","343434344445",4000.345);
		System.out.println(user2.balance);
		
		System.out.println(user1.balance);
	
		   System.out.println(user2.email);
	        user2.deposit(50);
	        user2.withdraw(500);
	        user2.checkBalance();
	        user2.deposit(1500);
	        user2.withdraw(2000);
	        user2.checkBalance();
	    

	}

}
