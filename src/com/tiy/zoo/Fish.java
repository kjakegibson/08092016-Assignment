package com.tiy.zoo;

public class Fish extends Tank{
	
	protected String type;
	protected String name;
	protected int numberOfFins;
	protected boolean isBoney;
	public Fish(boolean isEndangered, double weight, boolean isAlive, boolean fullOfWater, float size, String type,
			String name, int numberOfFins, boolean isBoney) {
		super(isEndangered, weight, isAlive, fullOfWater, size);
		this.type = type;
		this.name = name;
		this.numberOfFins = numberOfFins;
		this.isBoney = isBoney;
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
	public int getNumberOfFins() {
		return numberOfFins;
	}
	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}
	public boolean isBoney() {
		return isBoney;
	}
	public void setBoney(boolean isBoney) {
		this.isBoney = isBoney;
	}
	@Override
	public String toString() {
		return "Fish [type=" + type + ", name=" + name + ", numberOfFins=" + numberOfFins + ", isBoney=" + isBoney
				+ ", fullOfWater=" + fullOfWater + ", size=" + size + ", isEndangered=" + isEndangered + ", weight="
				+ weight + ", isAlive=" + isAlive + "]";
	}
	
	

}
