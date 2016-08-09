package com.tiy.zoo;

public class Mammal extends Cage{
	
	
	protected String type = null;
	protected String name = null;
	protected boolean isCarnivore = false;
	protected boolean isOmnivore = false;
	public Mammal(boolean isEndangered, double weight, boolean isAlive, boolean enclosed, int squareFeet, String type,
			String name, boolean isCarnivore, boolean isOmnivore) {
		super(isEndangered, weight, isAlive, enclosed, squareFeet);
		this.type = type;
		this.name = name;
		this.isCarnivore = isCarnivore;
		this.isOmnivore = isOmnivore;
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
	public boolean isCarnivore() {
		return isCarnivore;
	}
	public void setCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}
	public boolean isOmnivore() {
		return isOmnivore;
	}
	public void setOmnivore(boolean isOmnivore) {
		this.isOmnivore = isOmnivore;
	}
	@Override
	public String toString() {
		 
		String meatEat = null;
		if (!(isCarnivore)) {
	            meatEat = "eats only meat";
	        }
	        else 
	            meatEat = "doesn't eat meat";
		
		String allEat = null;
		if (!(isOmnivore)) {
            allEat = "eats only meat";
        }
        else 
            allEat = "doesn't eat meat";
		
		return "I went to the zoo and I saw a " + type + ", and it's name was " + name + ". This" + type + meatEat + ", isOmnivore=" + isOmnivore
				+ ", enclosed=" + enclosed + ", squareFeet=" + squareFeet + ", isEndangered=" + isEndangered
				+ ", weight=" + weight + ", isAlive=" + isAlive + "]";
	}

	
	

}
