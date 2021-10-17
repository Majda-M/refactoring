package refactoring;

public class Espece {
	public String nomEspece;
	public double tailleMaxAdulte;

	public Espece() {
	}
	public void PrintEspece() {
		System.out.println("Nom d'espece:"+nomEspece);
		System.out.println("La taille max d'adulte est :"+tailleMaxAdulte);
	}
}