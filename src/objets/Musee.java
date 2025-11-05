package objets;

import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
		nbTrophee += 1;
	}
	
	public String extraireInstructionsOCaml() {
		String chaine = "let musee = [";
		if (nbTrophee > 0) {
			for (int i = 0; i < nbTrophee; i++) {
				chaine += " 	\"" + trophees[i].nom() + "\", \"" + trophees[i].getEquipement() + "\";";
			}
		chaine += "]";
	}
}