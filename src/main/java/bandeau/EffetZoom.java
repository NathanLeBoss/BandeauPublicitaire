package bandeau;

import java.awt.Font;

public class EffetZoom extends Effet {

	@Override
	public void lancer() {
		for (int i = 5; i < 60 ; i+=5) {
			this.setFont(new Font("Dialog", Font.BOLD, 5+i));
			this.sleep(100);
		}		
	}

}
