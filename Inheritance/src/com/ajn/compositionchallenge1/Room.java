package com.ajn.compositionchallenge1;

public class Room {

	private Bed bed;
	private Chair chair;
	private Table table;
	private Fan fan;
	
	public Room(Bed bed, Chair chair, Table table, Fan fan) {
		this.bed = bed;
		this.chair = chair;
		this.table = table;
		this.fan = fan;
	}
	
	public void DimensionsOfChairAndTable() {
		System.out.println("Volume of chair and table -- ");
		chair.chairVolume();
		table.VolumeoftheTable();
	}
	
	public Fan getFan() {
		return fan;
	}

	public Bed getBed() {
		return bed;
	}
	
	
}
