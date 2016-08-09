package com.tiy.zoo;

import java.util.ArrayList;

public class Zoo {
	
	public static void main (String[] args)
	{

	ArrayList<Animal> myZoo = new ArrayList<>();
	
	Mammal mammalA = new Mammal(true, 800, true, false, 250, "Tiger", "Geraldo", true, false);
	Mammal mammalB = new Mammal(false, 6, true, false, 55000, "Giraffe", "Fulgrim", false, false);
	Mammal mammalC = new	Mammal(false, 165, true, true, 830, "Human", "Dolores from Accounts Receivable", false, true);
	Mammal mammalD = new Mammal(true, 1050, true, true, 1000, "Sasquatch", "Jenga", false, true);
	
	Reptile reptileA = new Reptile(false, 350, false, false, 150.50f, "Manaconda", "Archibald", 20);
	Reptile reptileB = new Reptile(true, 1400, false, false, 600f, "Utahraptor", "Explodeus", 4);
	Reptile reptileC = new Reptile(false, 15, true, false, 35, "Snek", "Don Stehp on Snek", 67);
	Reptile reptileD = new Reptile(false, 600, true, true, 900, "Crocodile", "Dumpster", 4);
	
	Bird birdA = new Bird(false, 25, false, false, 3, "Dodo", "Canterbury", false, 69);
	Bird birdB = new Bird(true, 48000, false, true, 100000, "Roc", "McGillicuddy", true, 800);
	Bird birdC = new Bird(true, 11, true, false, 90, "Have you heard?", "The bird is the word", false, 2);
	Bird birdD = new Bird(true, 4, true, true, 30, "Kiwi", "Playstation", false, 2);
	
	Amphibian amphibianA = new Amphibian(true, 0.35, true, false, 1, "Cereal Box Frog", "Dig'Em", false);
	Amphibian amphibianB = new Amphibian(true, 60, true, true, 90, "Giant Salamander", "Gregory", true);
	Amphibian amphibianC = new Amphibian(false, 1, true, true, 100, "Poison Dart Frog", "Diarrhea", false);
	Amphibian amphibianD = new Amphibian(true, 1, true, true, 10, "Axolotl", "That guy from that tv show Monk that played Monk", true);
	
	
	Fish fishA = new Fish(false, 9000, true, true, 30000.12f, "Whale Shark", "Golbez", 7, false);
	Fish fishB = new Fish(false, 200.00, true, true, 900, "Sea Cucumber", "Destroyer of Worlds", 0, false);
	Fish fishC = new Fish(false, 11000, false, true, 38000f, "Great White Shark", "Jaws: The Revenge", 6, false);
	Fish fishD = new Fish(true, 4, true, true, 200f, "Gulf Toadfish", "Ur Mom Lulz", 35, true);
	
	myZoo.add(mammalA);
	myZoo.add(mammalB);
	myZoo.add(mammalC);
	myZoo.add(mammalD);
	myZoo.add(reptileA);
	myZoo.add(reptileB);
	myZoo.add(reptileC);
	myZoo.add(reptileD);
	myZoo.add(birdA);
	myZoo.add(birdB);
	myZoo.add(birdC);
	myZoo.add(birdD);
	myZoo.add(amphibianA);
	myZoo.add(amphibianB);
	myZoo.add(amphibianC);
	myZoo.add(amphibianD);
	myZoo.add(fishA);
	myZoo.add(fishB);
	myZoo.add(fishC);
	myZoo.add(fishD);
	
	System.out.println(myZoo);
	}
	
}
