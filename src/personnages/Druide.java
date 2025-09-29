package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int effetPotion) {
		chaudron = new Chaudron();
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
		chaudron.remplirChaudron(quantité, forcePotion);
		this.parler("J'ai concocté " + quantité + "dose de potin magique,"
				+ "elle a une force de " + forcePotion);
	}
	
	private void booster(Gaulois gaulois) {
		
	}
}
