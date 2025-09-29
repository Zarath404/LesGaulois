package personnages;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom, int effetPotion) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
	return "Le Druide : ";
	}
	
	private void fabriquerPotion(int quantité, int forcePotion) {
		
	}
	
	private void booster(Gaulois gaulois) {
		
	}
}
