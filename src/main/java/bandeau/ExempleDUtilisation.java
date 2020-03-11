package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    private final Bandeau monBandeau = new Bandeau();
    private final Scenario1 sce1 = new Scenario1();
    private final Scenario2 sce2 = new Scenario2();

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }

    public void exemple() {
    	monBandeau.setMessage("Youhou!");
        sce1.lancer(monBandeau);
        monBandeau.setMessage("Et zééééé parti");
        sce2.lancer(monBandeau);
    }
}
