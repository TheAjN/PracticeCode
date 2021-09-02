package com.ajn.polmorphism1;


class Movie {
	private String movie;

	public Movie(String movie) {
		this.movie = movie;
	}
	
	public String plot() {
		return "No plot here";
	}

	public String getMovie() {
		return movie;
	}
	
	
}

class jaws extends Movie{

	public jaws() {
		super("Jaws");
	}
	
	@Override
	public String plot() {
		
		return "Sharks eats people";
	}	
}

class independenceday extends Movie{
	
	public independenceday() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		
		return "Aliens attempt to take over planet Earth";
	}
	
	public void test() {
		System.out.println("Testing");
	}
}


class mazerunner extends Movie{
	
	public mazerunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		
		return "Kids try and Escape a Maze";
	}
		
}


class StarWars extends Movie{
	
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial Forces try to take the universe";
	}
	
	
}


class Forgetable extends Movie{
	
	public Forgetable() {
		super("Forgetable");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	n=5;
		Movie movie;
		for(int i=0;i<n; i++) {
			movie= RandomMovie();			//eg- movie = new jaws();
									//	This becomes movie IS A Movie
					//But Movie IS NOT A jaws,Therefore Jaws jaw=new Movie(); is not allowed
			System.out.println(movie.getMovie());
			System.out.println(movie.plot() + "\n");
			
		}
		
		Movie movie2=new independenceday(); //This works since independenceday is a subclass
											//and Movie is a Superclass
		
		System.out.println(movie2.getMovie()); // constructor of independenceday is called
												//and it is initialized in an instance(movie) of class Movie
		
		
	}

	
	
	public static Movie RandomMovie() {
		
		int randomnumber = (int) (Math.random()*5) + 1; //gives random Number between Number 1 to 5
		System.out.println("Random Number Generated = " + randomnumber);
		
		switch(randomnumber) {
		
		case 1:
			return new jaws();
		case 2:
			return new independenceday();
		case 3:
			return new mazerunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		default:
			return null;
		}	
	}
}











