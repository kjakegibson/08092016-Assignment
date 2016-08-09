package com.tiy.zoo;

public class Bird extends Cage{
	
	
	protected String type;
	protected String name;
	protected boolean canFly;
	protected int wingSpan;
	public Bird(boolean isEndangered, double weight, boolean isAlive, boolean enclosed, int squareFeet, String type,
			String name, boolean canFly, int wingSpan) {
		super(isEndangered, weight, isAlive, enclosed, squareFeet);
		this.type = type;
		this.name = name;
		this.canFly = canFly;
		this.wingSpan = wingSpan;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	@Override
	public String toString() {
		return "Bird [type=" + type + ", name=" + name + ", canFly=" + canFly + ", wingSpan=" + wingSpan + ", enclosed="
				+ enclosed + ", squareFeet=" + squareFeet + ", isEndangered=" + isEndangered + ", weight=" + weight
				+ ", isAlive=" + isAlive + "]";
	}

}
