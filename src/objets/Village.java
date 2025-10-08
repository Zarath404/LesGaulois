package objets;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageoisMax;
	
	public Village(String nom, Gaulois chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > nbVillageois) {
			System.out.println("Il n'y a pas autant de d'habitant ici !");
			return null;
		}
		else {
			return villageois[numVillageois-1];
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef \"" + chef + "\" vivent les l gendaires gaulois :");
		for(Gaulois gaulois : villageois) {
			if (gaulois == null) {break;}
			System.out.println("- " + gaulois);
		}
	}
	
	public static void main(String[] arg) {
		Gaulois abraracourcix = new Gaulois("Abraracourix", 6);
		Village village = new Village("Village des Irreductibles", abraracourcix, 30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		Gaulois doublepolemix = new Gaulois("Doublepolemix", 4);
	}
}
