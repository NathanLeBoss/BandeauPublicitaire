/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author alefev02
 */
public class EffetTourne extends Effet {

    @Override
	public void lancer(Bandeau monBandeau) {
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(100);
		
		}
    
    }
}
