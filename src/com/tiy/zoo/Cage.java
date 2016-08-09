package com.tiy.zoo;

public class Cage extends Animal {
	
	protected boolean enclosed = false;
	protected int squareFeet = 0;
	
	

	public Cage(boolean isEndangered, double weight, boolean isAlive, boolean enclosed, int squareFeet) {
		super(isEndangered, weight, isAlive);
		this.enclosed = enclosed;
		this.squareFeet = squareFeet;
	}

	public boolean isEnclosed() {
		return enclosed;
	}

	public void setEnclosed(boolean enclosed) {
		this.enclosed = enclosed;
	}

	public int getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	
	

}
