package ajn.objectorentedprograming;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount AjNaccount= new BankAccount(); //334121, 80000, "Abhishek J", 
		//		"abhishek@gmail.com", 990047095 );
		
		System.out.println(AjNaccount.getCustomername());
		System.out.println(AjNaccount.getBalance());

	//	AjNaccount.setBalance(70000);
		System.out.println("Current Balance = "  + AjNaccount.getBalance());
		
		AjNaccount.depositFunds(400);
		AjNaccount.withdrawFunds(400);
//		AjNaccount.withdrawFunds(40000);
		
		
//		BankAccount BobAccount= new BankAccount("Bob","bob@gmail.com",99854155);
		
		
	}

}
