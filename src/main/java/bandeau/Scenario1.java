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
public class Scenario1 extends Scenario {
    
    private final EffetZoom zoom = new EffetZoom();
    private final EffetTourne tourne = new EffetTourne();
    private final EffetPolice police = new EffetPolice();
    private final EffetCouleurTexte texte = new EffetCouleurTexte();
    private final EffetCouleurFond fond = new EffetCouleurFond();
    
	@Override
	public void lancer(Bandeau monBandeau) {
            
            zoom.lancer(monBandeau);
            monBandeau.sleep(1000);
            texte.lancer(monBandeau);
            monBandeau.sleep(100);
            tourne.lancer(monBandeau);
            monBandeau.sleep(100);
            fond.lancer(monBandeau);
            monBandeau.sleep(100);
            police.lancer(monBandeau);
		
	}

    
}
