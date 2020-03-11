package bandeau;

import java.awt.Font;

public class EffetZoom extends Effet {

	/**
	 * Méthode par défaut
	 * @param monBandeau bandeau à changer
	 */
    public void lancer(Bandeau monBandeau) {
        for (int i = 5; i < 60; i += 5) {
        	monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
        	monBandeau.sleep(100);
        }
    }
    
    /**
     * Méthode avec param
     * @param monBandeau bandeau à changer
     * @param tailleDuZoom taille en unité de grandeur du zoom
     */
    public void lancer(Bandeau monBandeau, int tailleDuZoom) {
    	for (int i = 5; i < tailleDuZoom; i += 5) {
        	monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
        	monBandeau.sleep(100);
        }
    }

}
