package Specialisation;

class Animal {
	void parler() {
		System.out.println("Je parle");
	}
	void seDeplacer() {
		System.out.println("Je me déplace");
	}
}

class Chien extends Animal {
	void parler() {
		System.out.println("J'aboie");
	}
}

public class Specialisation {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal medor = new Chien();
		
		medor.parler();
		animal.parler();
		medor.seDeplacer();
		animal.seDeplacer();
	}
}
