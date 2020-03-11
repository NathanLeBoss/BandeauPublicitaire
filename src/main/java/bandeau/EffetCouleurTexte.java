/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author alefev02
 */
public class EffetCouleurTexte extends Effet {

    @Override
    public void lancer(Bandeau monBandeau) {
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.BLUE);
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.BLACK);
        monBandeau.sleep(1000);
    }

}
