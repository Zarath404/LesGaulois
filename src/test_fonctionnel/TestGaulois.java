package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 16);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour Ob�lix");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller loin d'ici ?");
		asterix.parler("Oe, volontier");
		
		System.out.println("Dans la for�t " + asterix.getNom() + " et " + obelix.getNom() + 
				" tombent nez � pif avec le romaing "+ minus.getNom());
		
		for(int i=0; i<4; i++){
			asterix.frapper(minus);
		}
	}
}
