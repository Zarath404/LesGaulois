package objets;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int prendreLouche() {
		return 0;
	}
}
