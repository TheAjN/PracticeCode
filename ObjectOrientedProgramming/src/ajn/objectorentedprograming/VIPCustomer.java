package ajn.objectorentedprograming;

public class VIPCustomer {
	private String name;
	private long creditLimit;
	private String email;
	
	
	public VIPCustomer() {
		this("John Smith", 8874501, "ajn@gmail.com");
	}


	public VIPCustomer(long creditLimit, String email) {
		this("Jack Smith", creditLimit, email);
	}


	public VIPCustomer(String name, long creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public long getCreditLimit() {
		return creditLimit;
	}


	public String getEmail() {
		return email;
	}
	
	
	
}
