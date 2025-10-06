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
	
	public void fabriquerPotion(int quantité, int forcePotion) {
		chaudron.remplirChaudron(quantité, forcePotion);
		this.parler("J'ai concocté " + quantité + " dose(s) de potin magique,"
				+ "elle a une force de " + forcePotion);
	}
	
	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion) {
			if (nomGaulois == "Obélix") {
				parler("Non " + nomGaulois + " et tu le sais très bien !");
			}
			else {
				chaudron.prendreLouche();
				gaulois.setEffetPotion(chaudron.getForcePotion());
				parler("Tien, " + nomGaulois + " un peu de potion pagique.");
			}
		}
		else {
			parler("Dsl " + nomGaulois + ", y a plus rien dans le chaudron.");
		}
	}
	
}
