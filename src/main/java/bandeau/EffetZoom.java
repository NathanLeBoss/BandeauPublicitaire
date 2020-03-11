package bandeau;

import java.awt.Font;

public class EffetZoom extends Effet {

    public void lancer(Bandeau monBandeau) {
        monBandeau.setMessage("Zoom........");
	monBandeau.sleep(1000);
        for (int i = 5; i < 60; i += 5) {
        	monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
        	monBandeau.sleep(100);
        }
    }

}
