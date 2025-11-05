package personnages;

import objets.Village;
import objets.Equipement;
import objets.Musee;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees = 0;
	private Village village;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
	this.nom = nom;
	this.force = force;
	}
	
	public String getNom() {
	return nom;
	}
	
	public int getForce() {
		return force;
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
		return "Le gaulois " + nom + " : ";
	}

	
	public String toString() {
		return nom;
	}
	
//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la m choire de " + nomRomain);
//		int forceCoup = force * effetPotion;
//		forceCoup = forceCoup/3;
//		romain.recevoirCoup(forceCoup);
//		if (effetPotion > 1) {
//			effetPotion = effetPotion - 1;
//		}
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m choire de " +
		romain.getNom());
		Equipement[] recompense = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; recompense != null && i < recompense.length; i++,
			nbTrophees++) {
			this.trophees[nbTrophees] = recompense[i];
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
	
	public void faireUneDonnation(Musee musee) {
		if (nbTrophees > 0) {
			this.parler("Je donne tous mes trophees :");
			for (int i = 0; i < nbTrophees; i++) {
				musee.donnerTrophee(this, trophees[i]);
				this.parler("- " + trophees[i].toString());
				nbTrophees--;
			}
		}
	}
}
