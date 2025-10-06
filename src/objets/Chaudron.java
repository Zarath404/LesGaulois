package objets;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
	public int getForcePotion() {
		return forcePotion;
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
		quantitePotion = quantitePotion - 1;
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		return 0;
	}
}
