package personnages;

import objets.Village;

public class Gaulois {
	private String nom;
	private int force;
	private Village village;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
	this.nom = nom;
	this.force = force;
	}
	
	public String getNom() {
	return nom;
	}	
	
	public void setVillage(Village village) {
		this.village = village;
	}
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
	return "Le gaulois " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force * effetPotion;
		forceCoup = forceCoup/3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion > 1) {
			effetPotion = effetPotion - 1;
		}
	}
	
	public void sePresenter() {
		System.out.println("Le Gaulois  " + nom + ": Bonjour, je m'appelle " +  nom + ".");
		
		if (village != null) {
			if (village.getChef() == this) {
				System.out.println("Je suis le chef du village "+ village.getNom());
			}
			else {
				System.out.println("J'habite le village " + village.getNom());
			}
		}
		else {
			System.out.println("Je voyage de village en village");
		}
	}
}

