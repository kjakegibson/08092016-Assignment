package com.tiy.zoo;

public class Tank extends Animal{
	
	protected boolean fullOfWater = false;
	protected float size = 0.0f;
	
	
	
	public Tank(boolean isEndangered, double weight, boolean isAlive, boolean fullOfWater, float size) {
		super(isEndangered, weight, isAlive);
		this.fullOfWater = fullOfWater;
		this.size = size;
	}
	public boolean isFullOfWater() {
		return fullOfWater;
	}
	public void setFullOfWater(boolean fullOfWater) {
		this.fullOfWater = fullOfWater;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	

}
