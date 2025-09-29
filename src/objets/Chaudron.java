package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		
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
