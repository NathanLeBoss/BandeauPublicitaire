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
public class EffetCouleurFond extends Effet {

    @Override
    public void lancer(Bandeau monBandeau) {

        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.RED);
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(1000);

    }

}
