package Model;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable{

	private List<Livre> liste;
	
	public Cart() {
		
	}

	public List<Livre> getListe() {
		return liste;
	}

	public void setListe(List<Livre> liste) {
		this.liste = liste;
	}
	
}
