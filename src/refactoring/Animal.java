package refactoring;

public class Animal {
	
	private Espece data = new Espece();
	private double age;
	private double genre;
	
	
	public Animal(String nomEspece, double tailleMaxAdulte, double age, double genre) {
		super();
		this.data.nomEspece = nomEspece;
		this.data.tailleMaxAdulte = tailleMaxAdulte;
		this.age = age;
		this.genre = genre;
	}

	
	public void PrintAnimal() {
		data.PrintEspece();
		printDetails();
	}


	private void printDetails() {
		System.out.println("l'age d'animal est :"+age);
		System.out.println("le genre d'animal est"+genre);
	}
	
}
	
