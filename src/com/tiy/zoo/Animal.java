package com.tiy.zoo;

public abstract class Animal {
	
	protected boolean isEndangered = false;
	protected double weight = 0.0;
	protected boolean isAlive = false;
	
	
	public Animal(boolean isEndangered, double weight, boolean isAlive) {
		this.isEndangered = isEndangered;
		this.weight = weight;
		this.isAlive = isAlive;
	}
	public boolean isEndangered() {
		return isEndangered;
	}
	public void setEndangered(boolean isEndangered) {
		this.isEndangered = isEndangered;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	
}
