package personnages;

import objets.Village;
import objets.Equipement;

public class Gaulois {
	private String nom;
//	private int force;
	private Village village;
	private int effetPotion = 1;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	
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
	
//	private String prendreParole() {
//	return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
	public String toString() {
		return nom;
	}
	
//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
//		int forceCoup = force * effetPotion;
//		forceCoup = forceCoup/3;
//		romain.recevoirCoup(forceCoup);
//		if (effetPotion > 1) {
//			effetPotion = effetPotion - 1;
//		}
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
			nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
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

