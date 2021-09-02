package ajn.objectorentedprograming;

public class VIPCustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIPCustomer ajnCustomer=new VIPCustomer();
		
		System.out.println(ajnCustomer.getName());
		System.out.println(ajnCustomer.getCreditLimit());
		System.out.println(ajnCustomer.getEmail());
		
		
		System.out.println("--------------------------------------------------------------");
		
		VIPCustomer abhiCustomer = new VIPCustomer(45099, "abhi@gmail.com");
		
		System.out.println(abhiCustomer.getName());
		System.out.println(abhiCustomer.getCreditLimit());
		System.out.println(abhiCustomer.getEmail());
		
		System.out.println("--------------------------------------------------------------");
		
VIPCustomer Customer = new VIPCustomer("Jaden Smith",9445749, "cus@gmail.com");
		
		System.out.println(Customer.getName());
		System.out.println(Customer.getCreditLimit());
		System.out.println(Customer.getEmail());
		
		
		
	}

}
