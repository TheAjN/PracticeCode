package com.ajn.polmorphism1;



class Car {

	private boolean engine;
	private String Name;
	private int cylinders;
	private int wheels;

	public Car(String name, int cylinders) {
		this.engine = true;
		Name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
		
	}

	public String getName() {
		return Name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void startengine() {
		System.out.println("Start Engine (Generic)");
	}

	public void accelerate() {
		System.out.println("Accelerate");
	}

	public void brake() {
		System.out.println("Brake");
	}

}

class CelerioX extends Car {

	public CelerioX(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startengine() {
		// TODO Auto-generated method stub
		System.out.println("Start Engine CelerioX");
	}

}

class Tesla extends Car {

	public Tesla(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startengine() {
		// TODO Auto-generated method stub
		System.out.println("Start Engine Tesla Model 3");
	}

}

class Mayback extends Car {

	public Mayback(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startengine() {
		// TODO Auto-generated method stub
		System.out.println("Start Engine Mayback");
	}
}

class toyota extends Car{
	
	public toyota(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		
		return getClass().getSimpleName() + " Toyota Class"; //getClass().getSimpleName() gives the class name 
	}
}


class Main2 {
	public static void main(String[] args) {
		
		Car randomCar;
		for(int i= 0; i<3; i++) {
			randomCar=randomCar();
			
			System.out.println("Name of the Car = " + randomCar.getName());
			randomCar.startengine();
			if(randomCar.getName().toLowerCase().equals("mayback")) {
				randomCar.accelerate();
			}
		}
		
		System.out.println();
		
		Car nissanCar = new Car("Nissan", 4) {				//Inline class created within the constructor
			
			@Override
			public void startengine() {
				System.out.println("Start Engine Nissan");
			}
			
			@Override
			public void accelerate() {
				System.out.println("Nissan Accelerate");

			}
			
			@Override
			public void brake() {
				System.out.println("Nissan Brake");
			}
		};
		
		nissanCar.startengine();
		nissanCar.accelerate();
		nissanCar.brake();
		
		
		System.out.println();
		
		toyota t = new toyota("Yaris", 3);
		
		System.out.println(t.getName());
	}

	public static Car randomCar() {

		int randomnumber = (int) ((Math.random() * 3) + 1);

		switch (randomnumber) {
		case 1:
			return new CelerioX("Celerio X", 2);
		case 2:
			return new Tesla("Tesla Model 3", 0);
		case 3:
			return new Mayback("Mayback", 4) {
				@Override
				public void accelerate() {
					System.out.println("Mayback Accelerate");
				}
			};
		default:
			return null;
		}

	}
}
