package com.ajn.compositionchallenge1;

public class Dimension {

	
	private int length;
	private int width;
	private int height;
	
	public Dimension() {
		this(0, 0, 0);
	}
	
	public Dimension(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int volume() {
		return length*width*height;
	}
	
	
}
