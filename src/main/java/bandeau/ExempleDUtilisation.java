package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    private final Bandeau monBandeau = new Bandeau();
    private final Scenario1 sce1 = new Scenario1();

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
    	monBandeau.setMessage("youhou!");
        sce1.lancer(monBandeau);
    }
}
