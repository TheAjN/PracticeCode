package ajn.objectorentedprograming;

public class Main {

	public static void main(String[] args) {
		
		//Car porshce = new Car();
//		Car maruti = new Car();
//		
//		maruti.setDoors(4);
//		System.out.println("Model is - " + maruti.getModel());
//		maruti.setModel("Celerio X");
//		
//		System.out.println("Model is - " + maruti.getModel());
//		
//		
//		
//		Point p= new Point(6,5);
//		
//		System.out.println("distance(0,0)= " + p.distance());
		
		ComplexOperations one = new ComplexOperations(1.0, 1.0);
		ComplexOperations number = new ComplexOperations(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
	}

}
