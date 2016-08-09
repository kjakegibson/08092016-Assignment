package com.tiy.zoo;

public class Amphibian extends Tank{
	
	protected String type;
	protected String name;
	protected boolean hasTail;
	public Amphibian(boolean isEndangered, double weight, boolean isAlive, boolean fullOfWater, float size, String type,
			String name, boolean hasTail) {
		super(isEndangered, weight, isAlive, fullOfWater, size);
		this.type = type;
		this.name = name;
		this.hasTail = hasTail;
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
	public boolean isHasTail() {
		return hasTail;
	}
	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}
	@Override
	public String toString() {
		return "Amphibian [type=" + type + ", name=" + name + ", hasTail=" + hasTail + ", fullOfWater=" + fullOfWater
				+ ", size=" + size + ", isEndangered=" + isEndangered + ", weight=" + weight + ", isAlive=" + isAlive
				+ "]";
	}

}
