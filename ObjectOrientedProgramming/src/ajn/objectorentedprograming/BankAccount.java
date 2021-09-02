package ajn.objectorentedprograming;

public class BankAccount {
	
	private long accountnumber;
	private double balance;
	private String customername;
	private String email;
	private long phonenumber;
	
	
	public BankAccount() {
		this(123456,0.0,"Unknown","No email",12345); //This should be the first statement
		System.out.println("Empty constructor called");
	}
	
	public BankAccount(long accountnumber, double balance, 			//This is the main constructor
			String customername, String email , long phonenumber) {
		
		System.out.println("Parameterized Consructor called");
		this.accountnumber=accountnumber;
		this.balance=balance;
		this.customername=customername;
		this.email=email;
		this.phonenumber=phonenumber;
//		
		
	}
	
	
	public BankAccount(String customername, String email, long phonenumber) {
		
		this(9999,3000,customername,email,phonenumber);
		System.out.println("3rd constructor called");
		
//		this.customername = customername;
//		this.email = email;
//		this.phonenumber = phonenumber;
	}

	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public void depositFunds(double deposit) {
		balance+=deposit;
		System.out.println("Balance after Deposit = " + balance);
	}

	public void withdrawFunds(double withdraw) {
		if((balance-withdraw) >=0) {
			balance-=withdraw;
			System.out.println("balance after withdrawal of " + withdraw+ " = " + balance);
		}else {
			System.out.println("Insuffient balance = " + balance);
		}	
		
	}
}




