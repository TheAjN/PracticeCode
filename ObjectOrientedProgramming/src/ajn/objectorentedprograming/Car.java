package ajn.objectorentedprograming;

public class Car {

	private int doors;
	//private int wheels;
	private String model;
	//private String colour;
	//private String engine;
	
	public void setDoors(int doors) {
		this.doors=doors;
	}
	
	public void setModel(String model) {
		String lowermodel= model.toLowerCase();
		if(lowermodel.equals("celerio x")) {
			this.model=model;
		}else {
			this.model="Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
}
