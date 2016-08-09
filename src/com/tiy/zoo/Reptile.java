package com.tiy.zoo;

public class Reptile extends Tank{
	
	protected String type = null;
	protected String name = null;
	int numberOfLimbs = 0;
	
	
	public Reptile(boolean isEndangered, double weight, boolean isAlive, boolean fullOfWater, float size, String type,
			String name, int numberOfLimbs) {
		super(isEndangered, weight, isAlive, fullOfWater, size);
		this.type = type;
		this.name = name;
		this.numberOfLimbs = numberOfLimbs;
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
	public int getNumberOfLimbs() {
		return numberOfLimbs;
	}
	public void setNumberOfLimbs(int numberOfLimbs) {
		this.numberOfLimbs = numberOfLimbs;
	}
	@Override
	public String toString() {
		return "Reptile [type=" + type + ", name=" + name + ", numberOfLimbs=" + numberOfLimbs + ", fullOfWater="
				+ fullOfWater + ", size=" + size + ", isEndangered=" + isEndangered + ", weight=" + weight
				+ ", isAlive=" + isAlive + "]";
	}

}