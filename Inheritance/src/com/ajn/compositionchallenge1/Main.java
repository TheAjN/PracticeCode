package com.ajn.compositionchallenge1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimension dimensionTable=new Dimension(20,10,15);
		Dimension dimensionChair = new Dimension(10,5,20);
		
		Table table = new Table(dimensionTable, "brown");
		Chair chair = new Chair(dimensionChair, "White");
		
		Fan fan = new Fan("Usha", "Maroon");
		Bed bed  = new Bed("Ikea", "Wood");
		
		Room room=new Room(bed, chair, table, fan);
		
		room.DimensionsOfChairAndTable();
		room.getFan().switchonFan();
	}

}
