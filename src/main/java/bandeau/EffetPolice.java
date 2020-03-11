package bandeau;

import java.awt.Font;

public class EffetPolice extends Effet {

	/**
	 * Méthode par défaut
	 * @param monBandeau le bandeau à changer
	 */
	public void lancer(Bandeau monBandeau) {
		monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
                monBandeau.sleep(100);
                monBandeau.setFont(new Font("Monospaced", Font.BOLD, 24));
                
	}
	
	/**
	 * Méthode en choisissant la police
	 * @param monBandeau le bandeau à changer
	 * @param maPolice la police choisie
	 */
	public void lancer(Bandeau monBandeau, String maPolice) {
		monBandeau.setFont(new Font(maPolice, Font.BOLD, 15));
	}
	
}
